package Blog;

public class Main {
    public static void main(String[] args) {
        BlogPost post1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet", "2000-05-04");
        BlogPost post2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010-10-10");
        BlogPost post3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cyersecuruty engineer at IBM, doesn't want to be the center of attention. When I asked to take his picture outside one of IMB's New York City offices, he told me that he wasn't really into the whole organoizer profile thing", "2017-03-28");
        Blog myBlog = new Blog("My first blog");
        Blog yourBlog = new Blog("Your first blog");
        Blog blog3 = new Blog("Blog About Everything");
        myBlog.addPost(post1);
        myBlog.addPost(post2);
        myBlog.addPost(post3);
        yourBlog.addBlog(myBlog);
        blog3.addBlog(yourBlog);
        blog3.addBlog(myBlog);
        System.out.println(myBlog);
        System.out.println(yourBlog);
        System.out.println(blog3);
        blog3.updatePost(1, post3);
        blog3.updatePost(2, post3);
        blog3.updatePost(0, post3);
        System.out.println(blog3);
        blog3.deletePost(0);
        blog3.deletePost(0);
        blog3.deletePost(0);
        System.out.println(blog3);
    }
}
