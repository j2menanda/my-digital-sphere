package org.kramatas.digital.sphere.service;

import org.kramatas.digital.sphere.payload.PostDto;
import org.kramatas.digital.sphere.payload.PostResponse;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}
