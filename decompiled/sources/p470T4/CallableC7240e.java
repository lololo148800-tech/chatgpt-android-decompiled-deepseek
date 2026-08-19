package p470T4;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.VideoCodecStatus;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoFrame;
import p1113xn.AbstractC21323q;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p557Wl.C8964t;
import p604Yk.C10077b;
import p867l8.C16831c;
import p904nb.RunnableC17544a;
import p904nb.ScheduledExecutorServiceC17549f;

/* JADX INFO: renamed from: T4.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC7240e implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f22957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f22958c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f22959d;

    public /* synthetic */ CallableC7240e(Object obj, Object obj2, Object obj3, int i10) {
        this.f22956a = i10;
        this.f22957b = obj;
        this.f22958c = obj2;
        this.f22959d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj = this.f22958c;
        Object obj2 = this.f22959d;
        Object obj3 = this.f22957b;
        switch (this.f22956a) {
            case 0:
                WorkDatabase workDatabase = ((C7241f) obj3).f22965e;
                String str = (String) obj2;
                ((ArrayList) obj).addAll(workDatabase.mo12357u().m12667l(str));
                return workDatabase.mo12356t().m12646p(str);
            case 1:
                C8964t this$0 = (C8964t) obj3;
                AbstractC16544l.m18094g(this$0, "this$0");
                VideoFrame frame = (VideoFrame) obj;
                AbstractC16544l.m18094g(frame, "$frame");
                VideoEncoder.Settings settings = this$0.f27398c;
                VideoEncoder.EncodeInfo encodeInfo = (VideoEncoder.EncodeInfo) obj2;
                VideoEncoder videoEncoder = this$0.f27396a;
                if (settings == null) {
                    return videoEncoder.encode(frame, encodeInfo);
                }
                int width = frame.getBuffer().getWidth();
                VideoEncoder.Settings settings2 = this$0.f27398c;
                AbstractC16544l.m18091d(settings2);
                if (width == settings2.width) {
                    return videoEncoder.encode(frame, encodeInfo);
                }
                VideoFrame.Buffer buffer = frame.getBuffer();
                int width2 = buffer.getWidth();
                int height = buffer.getHeight();
                VideoEncoder.Settings settings3 = this$0.f27398c;
                AbstractC16544l.m18091d(settings3);
                int i10 = settings3.width;
                VideoEncoder.Settings settings4 = this$0.f27398c;
                AbstractC16544l.m18091d(settings4);
                VideoFrame.Buffer bufferCropAndScale = buffer.cropAndScale(0, 0, width2, height, i10, settings4.height);
                VideoCodecStatus videoCodecStatusEncode = videoEncoder.encode(new VideoFrame(bufferCropAndScale, frame.getRotation(), frame.getTimestampNs()), encodeInfo);
                bufferCropAndScale.release();
                return videoCodecStatusEncode;
            case 2:
                C8964t this$1 = (C8964t) obj3;
                AbstractC16544l.m18094g(this$1, "this$0");
                VideoEncoder.Settings settings5 = (VideoEncoder.Settings) obj;
                AbstractC16544l.m18094g(settings5, "$settings");
                C8395g c8395g = AbstractC8396h.Companion;
                EnumC8397i enumC8397i = EnumC8397i.f26118o0;
                AbstractC8396h.Companion.getClass();
                int iCompareTo = enumC8397i.compareTo(AbstractC8396h.f26115a);
                VideoEncoder videoEncoder2 = this$1.f27396a;
                if (iCompareTo >= 0 && AbstractC22225a.m22419a() > 0) {
                    AbstractC21323q.m21718e("initEncode() thread=" + Thread.currentThread().getName() + " [" + Thread.currentThread().getId() + "]\n                |  encoder=" + videoEncoder2.getImplementationName() + "\n                |  streamSettings:\n                |    numberOfCores=" + settings5.numberOfCores + "\n                |    width=" + settings5.width + "\n                |    height=" + settings5.height + "\n                |    startBitrate=" + settings5.startBitrate + "\n                |    maxFramerate=" + settings5.maxFramerate + "\n                |    automaticResizeOn=" + settings5.automaticResizeOn + "\n                |    numberOfSimulcastStreams=" + settings5.numberOfSimulcastStreams + "\n                |    lossNotification=" + settings5.capabilities.lossNotification + "\n                        ");
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18569g(new Object[0]);
                }
                return videoEncoder2.initEncode(settings5, (VideoEncoder.Callback) obj2);
            default:
                ScheduledExecutorServiceC17549f scheduledExecutorServiceC17549f = (ScheduledExecutorServiceC17549f) obj3;
                scheduledExecutorServiceC17549f.getClass();
                return scheduledExecutorServiceC17549f.f56147Y.submit(new RunnableC17544a((Callable) obj, 1, (C10077b) obj2));
        }
    }
}
