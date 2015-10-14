package com.onyx.reader.api;

import android.graphics.PointF;

/**
 * Created by zhuzeng on 10/3/15.
 */
public interface ReaderHitTestManager {

    /**
     * Retrieve document coordinates from view coordinates.
     * @param viewPoint The view coordinates.
     * @param documentPoint The returned document coordinates.
     * @return false if failed.
     */
    public boolean viewToDoc(final PointF viewPoint, final PointF documentPoint);


    /**
     * Select word by the point. The plugin should automatically extend the selection to word boundary.
     * @param viewPoint the user input point.
     * @return the selection.
     */
    public ReaderSelection selectWord(final PointF viewPoint, final ReaderTextSplitter splitter);


    /**
     * Get document position for specified point.
     * @param point
     * @return
     */
    public ReaderDocumentPosition position(final PointF point);

    /**
     * Select text between start point and end point.
     * @param startPoint The start view point.
     * @param endPoint The end view point.
     * @return the selection.
     */
    public ReaderSelection select(final PointF startPoint, final PointF endPoint);


}
