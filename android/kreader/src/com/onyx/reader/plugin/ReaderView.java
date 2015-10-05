package com.onyx.reader.plugin;

import java.util.List;

/**
 * Created by zhuzeng on 10/2/15.
 * Main features
 * - View options management
 * - Navigation management
 * - Text style management
 * - Scaling style management
 * - Page layout management
 * - Coordinates system management
 *
 */
public interface ReaderView {

    /**
     * Retrieve view options interface.
     */
    public ReaderViewOptions getViewOptions();

    /**
     * Retrieve renderer.
     * @return the renderer.
     */
    public ReaderRenderer getRenderer();

    /**
     * Retrieve the navigator.
     * @return
     */
    public ReaderNavigator getNavigator();

    /**
     * Retrieve text style interface.
     */
    public ReaderTextStyleManager getTextStyleManager();

    /**
     * Retrieve scaling manager interface.
     * @return
     */
    public ReaderScalingManager getScalingManager();

    /**
     * Retrieve ReaderPageLayout manager interface.
     * @return
     */
    public ReaderPageLayoutManager getPageLayoutManager();

    /**
     * Retrieve reader hit test.
     */
    public ReaderHitTestManager getReaderHitTestManager();

    /**
     * Retrieve current visible links.
     * @return
     */
    public List<ReaderLink> getVisibleLinks();

    /**
     * Retrieve search interface.
     * @return
     */
    public ReaderSearchManager getSearchManager();

}
