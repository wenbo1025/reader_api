package com.onyx.reader.api;

import android.content.Context;

import java.util.List;

/**
 * Created by zhuzeng on 10/2/15.
 */
public interface ReaderPlugin {

    /**
     * Return the plugin display name.
     * @return
     */
    public String displayName();

    /**
     * Tell file type list the plugin supports.
     * @return file extension name list.
     */
    public List<String> supportedFileList();

    /**
     * Try to open the document specified by the path.
     * @param path The path in local file system.
     * @param documentOptions The document opening options.
     * @param pluginOptions The plugin options.
     * @return Reader document instance.
     * @throws ReaderException
     */
    public ReaderDocument open(final String path, final ReaderDocumentOptions documentOptions, final ReaderPluginOptions pluginOptions) throws ReaderException;

    /**
     * Check if drm is supported or not.
     * @return
     */
    public boolean supportDrm();

    /**
     * DRM support
     */
    public ReaderDrmManager createDrmManager();

    /**
     * Abort current running job if possible.
     */
    public void abortCurrentJob();

    /**
     * Clear setAbortFlag flag.
     */
    public void clearAbortFlag();

}
