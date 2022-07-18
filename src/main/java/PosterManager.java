public class PosterManager {
    private String[] movies = new String[0];
    private int limit;

    public PosterManager() {//limit = 10
        limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;

    }

    public void add(String poster) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = poster;
        movies = tmp;

    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        String[] ans;
        if (limit < movies.length) {
            ans = new String[limit];
        } else {
            ans = new String[movies.length];
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = movies[movies.length - i];
        }
        return ans;

    }
}
