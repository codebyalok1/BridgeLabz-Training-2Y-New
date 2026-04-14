class Movie {
    String title;
    Movie prev, next;

    Movie(String t) { title = t; }
}

class MovieList {
    Movie head, tail;

    void addEnd(Movie m) {
        if (head == null) {
            head = tail = m;
            return;
        }
        tail.next = m;
        m.prev = tail;
        tail = m;
    }
}