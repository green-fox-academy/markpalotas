package Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    String blogName;
    private List<BlogPost> blogposts = new ArrayList<BlogPost>();

    public Blog(String blogName) {
        this.blogName = blogName;
    }

    public List<BlogPost> addBlog(Blog blogName) {
        blogposts.addAll(blogName.blogposts);
        return blogposts;
    }

    public List<BlogPost> addPost(BlogPost blogPost) {
        blogposts.add(blogPost);
        return blogposts;
    }

    public List<BlogPost> deletePost(int index) {
        blogposts.remove(blogposts.get(index));
        return blogposts;
    }

    public List<BlogPost> updatePost(int index, BlogPost blogPost) {
        blogposts.set(index, blogPost);
        return blogposts;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogName='" + blogName + '\'' +
                ", blogposts=" + blogposts +
                '}';
    }
}
