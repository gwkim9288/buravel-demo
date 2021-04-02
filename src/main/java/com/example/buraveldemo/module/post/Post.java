package com.example.buraveldemo.module.post;

import com.example.buraveldemo.module.account.Account;
import com.example.buraveldemo.module.bookmarkPost.BookmarkPost;
import com.example.buraveldemo.module.plan.Plan;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    @Column(name = "post_id")
    private Long id;

    @Column(nullable = false)
    private String postTitle;

    @Column(nullable = false)
    private Long price;

    @Lob
    @Basic(fetch = FetchType.EAGER)
    private String postImage;

    @Enumerated(EnumType.STRING)
    private PostCategory category;

    private Float rating;

    private boolean closed;

    @Lob
    @Basic(fetch = FetchType.EAGER)
    private String memo;

    @ManyToOne(fetch = FetchType.LAZY)
    private Account postManager;

    @OneToMany(mappedBy = "post")
    private List<BookmarkPost> bookmarkPosts = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Plan planOf;

    //todo location 스펙 물어보기 + location필드추가
}
