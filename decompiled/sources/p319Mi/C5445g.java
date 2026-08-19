package p319Mi;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p328N1.C5609y;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;

/* JADX INFO: renamed from: Mi.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C5445g extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f17790Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5447i f17791Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5445g(C5447i c5447i, int i10) {
        super(2);
        this.f17790Y = i10;
        this.f17791Z = c5447i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.f17790Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(AbstractC5444f.f17789a[this.f17791Z.f17794a.ordinal()] == 1 ? R.string.voice_training_video_title : R.string.voice_training_title, c6021p), null, 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c, c6021p, 196608, 0, 65502);
                }
                return C17296C.f55119a;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    int iOrdinal = this.f17791Z.f17794a.ordinal();
                    if (iOrdinal == 0) {
                        i10 = R.string.voice_training_audio_improve_model_description;
                    } else if (iOrdinal == 1) {
                        i10 = R.string.voice_training_video_improve_model_description;
                    } else {
                        if (iOrdinal != 2) {
                            throw new C0644w();
                        }
                        i10 = R.string.voice_training_av_improve_model_description;
                    }
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(i10, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                return C17296C.f55119a;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    int iOrdinal2 = this.f17791Z.f17794a.ordinal();
                    if (iOrdinal2 == 0) {
                        i11 = R.string.voice_training_audio_privacy_description;
                    } else if (iOrdinal2 == 1) {
                        i11 = R.string.voice_training_video_privacy_description;
                    } else {
                        if (iOrdinal2 != 2) {
                            throw new C0644w();
                        }
                        i11 = R.string.voice_training_av_privacy_description;
                    }
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(i11, c6021p3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 0, 0, 131070);
                }
                return C17296C.f55119a;
        }
    }
}
