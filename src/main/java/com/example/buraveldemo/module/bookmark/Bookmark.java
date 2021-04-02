package com.example.buraveldemo.module.bookmark;

import com.example.buraveldemo.module.account.Account;
import com.example.buraveldemo.module.bookmarkPost.BookmarkPost;
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
public class Bookmark {
    @Id
    @GeneratedValue
    @Column(name = "bookmark_id")
    private Long id;

    private String bookmarkTitle; // 북마크폴더명

    @ManyToOne(fetch = FetchType.LAZY)
    private Account bookmarkManager;

    @OneToMany(mappedBy = "bookmark")
    private List<BookmarkPost> bookmarkPosts = new ArrayList<>();

}
