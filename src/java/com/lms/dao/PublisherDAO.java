package com.lms.dao;

import com.lms.model.Book;
import com.lms.model.Publisher;
import java.util.List;

public interface PublisherDAO {
    public void savePublisher(Publisher publisher);
    public List<Publisher> listPublisher();
    public void removePublisher(Integer publisherNo);
    public Publisher getPublisherById(Integer publisherNo);
    public List<Publisher> listOurPublishers();
    public List<Book> getAllBooksByPublisher(Integer publisherNo);
}
