package com.onyx.reader.api;

import java.util.List;

/**
 * Created by zhuzeng on 10/3/15.
 */
public interface ReaderSearchManager {

    public boolean searchPrevious(final ReaderSearchOptions options);

    public boolean searchNext(final ReaderSearchOptions options);

    public List<ReaderSelection> searchResults();

}
