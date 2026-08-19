package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
public class VideoSource extends MediaSource {
    private final CapturerObserver capturerObserver;
    private boolean isCapturerRunning;
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;
    private VideoProcessor videoProcessor;
    private final Object videoProcessorLock;

    public static class AspectRatio {
        public static final AspectRatio UNDEFINED = new AspectRatio(0, 0);
        public final int height;
        public final int width;

        public AspectRatio(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }
    }

    public VideoSource(long j10) {
        super(j10);
        this.videoProcessorLock = new Object();
        this.capturerObserver = new CapturerObserver() { // from class: livekit.org.webrtc.VideoSource.1
            @Override // livekit.org.webrtc.CapturerObserver
            public void onCapturerStarted(boolean z6) {
                VideoSource.this.nativeAndroidVideoTrackSource.setState(z6);
                synchronized (VideoSource.this.videoProcessorLock) {
                    try {
                        VideoSource.this.isCapturerRunning = z6;
                        if (VideoSource.this.videoProcessor != null) {
                            VideoSource.this.videoProcessor.onCapturerStarted(z6);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // livekit.org.webrtc.CapturerObserver
            public void onCapturerStopped() {
                VideoSource.this.nativeAndroidVideoTrackSource.setState(false);
                synchronized (VideoSource.this.videoProcessorLock) {
                    try {
                        VideoSource.this.isCapturerRunning = false;
                        if (VideoSource.this.videoProcessor != null) {
                            VideoSource.this.videoProcessor.onCapturerStopped();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // livekit.org.webrtc.CapturerObserver
            public void onFrameCaptured(VideoFrame videoFrame) {
                VideoProcessor.FrameAdaptationParameters frameAdaptationParametersAdaptFrame = VideoSource.this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
                synchronized (VideoSource.this.videoProcessorLock) {
                    try {
                        if (VideoSource.this.videoProcessor != null) {
                            VideoSource.this.videoProcessor.onFrameCaptured(videoFrame, frameAdaptationParametersAdaptFrame);
                            return;
                        }
                        VideoFrame videoFrameM18741b = AbstractC17003K.m18741b(videoFrame, frameAdaptationParametersAdaptFrame);
                        if (videoFrameM18741b != null) {
                            VideoSource.this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrameM18741b);
                            videoFrameM18741b.release();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$0(VideoFrame videoFrame) {
        this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$1(VideoFrame videoFrame) {
        runWithReference(new RunnableC16969A(this, 5, videoFrame));
    }

    public void adaptOutputFormat(int i10, int i11, int i12) {
        int iMax = Math.max(i10, i11);
        int iMin = Math.min(i10, i11);
        adaptOutputFormat(iMax, iMin, iMin, iMax, i12);
    }

    @Override // livekit.org.webrtc.MediaSource
    public void dispose() {
        setVideoProcessor(null);
        super.dispose();
    }

    public CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    public long getNativeVideoTrackSource() {
        return getNativeMediaSource();
    }

    public void setIsScreencast(boolean z6) {
        this.nativeAndroidVideoTrackSource.setIsScreencast(z6);
    }

    public void setVideoProcessor(VideoProcessor videoProcessor) {
        synchronized (this.videoProcessorLock) {
            try {
                VideoProcessor videoProcessor2 = this.videoProcessor;
                if (videoProcessor2 != null) {
                    videoProcessor2.setSink(null);
                    if (this.isCapturerRunning) {
                        this.videoProcessor.onCapturerStopped();
                    }
                }
                this.videoProcessor = videoProcessor;
                if (videoProcessor != null) {
                    videoProcessor.setSink(new C17028a(this, 3));
                    if (this.isCapturerRunning) {
                        videoProcessor.onCapturerStarted(true);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void adaptOutputFormat(int i10, int i11, int i12, int i13, int i14) {
        adaptOutputFormat(new AspectRatio(i10, i11), Integer.valueOf(i10 * i11), new AspectRatio(i12, i13), Integer.valueOf(i12 * i13), Integer.valueOf(i14));
    }

    public void adaptOutputFormat(AspectRatio aspectRatio, Integer num, AspectRatio aspectRatio2, Integer num2, Integer num3) {
        this.nativeAndroidVideoTrackSource.adaptOutputFormat(aspectRatio, num, aspectRatio2, num2, num3);
    }
}
