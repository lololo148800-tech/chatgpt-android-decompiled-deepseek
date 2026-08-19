package pf;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16524A;
import kotlin.jvm.internal.C16556x;
import kotlin.jvm.internal.C16558z;
import livekit.org.webrtc.MediaStreamTrack;
import mm.C17296C;
import p025An.C0624m;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21322p;
import p195Hh.C3430e;
import p523V9.AbstractC8154o0;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p909nm.C17689w;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: pf.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C18406v extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f58708Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18407w f58709Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f58710o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18406v(C18407w c18407w, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58709Z = c18407w;
        this.f58710o0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18406v(this.f58709Z, this.f58710o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18406v) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws IOException {
        MediaFormat trackFormat;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f58708Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18407w c18407w = this.f58709Z;
            C3430e c3430e = c18407w.f58712b;
            StringBuilder sb2 = new StringBuilder("Generating waveform for ");
            String str = this.f58710o0;
            sb2.append(str);
            AbstractC8160o6.m8726a(c3430e, sb2.toString(), null, 6);
            if (AbstractC16544l.m18089b(c18407w.f58717g, str)) {
                return C17689w.f56480Y;
            }
            if (c18407w.f58717g != null) {
                c18407w.m19869b();
            }
            c18407w.f58717g = str;
            MediaExtractor mediaExtractor = new MediaExtractor();
            c18407w.f58714d = mediaExtractor;
            mediaExtractor.setDataSource(c18407w.f58711a, Uri.parse(str), (Map<String, String>) null);
            int trackCount = mediaExtractor.getTrackCount();
            int i11 = 0;
            while (true) {
                if (i11 >= trackCount) {
                    trackFormat = null;
                    break;
                }
                trackFormat = mediaExtractor.getTrackFormat(i11);
                AbstractC16544l.m18093f(trackFormat, "getTrackFormat(...)");
                String string = trackFormat.getString("mime");
                if (string == null) {
                    string = "";
                }
                if (AbstractC21322p.m21667A(string, MediaStreamTrack.AUDIO_TRACK_KIND, false)) {
                    c18407w.f58715e = trackFormat.getLong("durationUs") / 1000000.0f;
                    mediaExtractor.selectTrack(i11);
                    break;
                }
                i11++;
            }
            if (trackFormat == null) {
                throw new IllegalStateException("No audio format found");
            }
            this.f58708Y = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(this));
            c0624m.m1262r();
            try {
                String string2 = trackFormat.getString("mime");
                if (string2 == null) {
                    throw new IllegalStateException("No MIME type found");
                }
                C16558z c16558z = new C16558z();
                c16558z.f51287Y = 16;
                C16556x c16556x = new C16556x();
                C16558z c16558z2 = new C16558z();
                C16524A c16524a = new C16524A();
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string2);
                AbstractC16544l.m18093f(mediaCodecCreateDecoderByType, "createDecoderByType(...)");
                c18407w.f58713c = mediaCodecCreateDecoderByType;
                mediaCodecCreateDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                mediaCodecCreateDecoderByType.setCallback(new C18405u(c16556x, c18407w, c0624m, c16558z2, c16558z, c16524a));
                mediaCodecCreateDecoderByType.start();
                obj = c0624m.m1261q();
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } catch (Exception e10) {
                c18407w.m19869b();
                c0624m.resumeWith(AbstractC9233X.m9806b(e10));
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
