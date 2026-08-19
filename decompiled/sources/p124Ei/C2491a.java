package p124Ei;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC7925K4;
import p523V9.AbstractC8126k4;
import p855kj.AbstractC16428g;
import p855kj.C16424c;
import p855kj.C16425d;
import p855kj.C16426e;
import p855kj.C16427f;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Ei.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2491a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7764Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC16428g f7765Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2491a(AbstractC16428g abstractC16428g, int i10) {
        super(2);
        this.f7764Y = i10;
        this.f7765Z = abstractC16428g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        String strM19533p;
        switch (this.f7764Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    c6021p.m6524S(-1303233196);
                    AbstractC16428g abstractC16428g = this.f7765Z;
                    if (abstractC16428g instanceof C16424c) {
                        strM19533p = AbstractC17792x.m19533p(c6021p, 553523937, R.string.audio_device_bluetooth, c6021p, false);
                    } else if (abstractC16428g instanceof C16427f) {
                        strM19533p = AbstractC17792x.m19533p(c6021p, 553526722, R.string.audio_device_headphones, c6021p, false);
                    } else if (abstractC16428g instanceof C16425d) {
                        strM19533p = AbstractC17792x.m19533p(c6021p, 553529405, R.string.audio_device_phone, c6021p, false);
                    } else {
                        if (!(abstractC16428g instanceof C16426e)) {
                            c6021p.m6524S(553419986);
                            c6021p.m6553p(false);
                            throw new C0644w();
                        }
                        strM19533p = AbstractC17792x.m19533p(c6021p, 553532063, R.string.audio_device_speaker, c6021p, false);
                    }
                    c6021p.m6553p(false);
                    AbstractC4124r4.m4768b(strM19533p, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                return C17296C.f55119a;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(AbstractC7925K4.m8215f(this.f7765Z), c6021p2, 0), null, null, 0L, c6021p2, 48, 12);
                }
                return C17296C.f55119a;
        }
    }
}
