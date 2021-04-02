package com.example.buraveldemo.module.bookmarkPost;

import com.example.buraveldemo.module.account.Account;
import com.example.buraveldemo.module.bookmark.Bookmark;
import com.example.buraveldemo.module.post.Post;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookmarkPost {
    @Id
    @GeneratedValue
    @Column(name = "bookmark_post_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Account bookmarkPostManager;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookmark_id")
    private Bookmark bookmark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;
}

