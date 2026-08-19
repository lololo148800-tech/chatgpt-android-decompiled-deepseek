package p406Qg;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0251g0;
import p049Bm.InterfaceC1436k;
import p1143z4.C21795y;
import p1155zi.C21936L0;
import p318Mh.AbstractC5364G0;
import p318Mh.C5375N;
import p318Mh.C5376O;
import p318Mh.C5393d;
import p318Mh.C5431w;
import p349O0.C5950F;
import p523V9.AbstractC8106i0;
import p552Wg.C8857s;
import p553Wh.C8870f;
import p577Xf.C9506e;
import p926of.C18177n;
import p926of.C18178o;
import p926of.InterfaceC18179p;
import tf.C19921f;
import tf.C19922g;
import tf.InterfaceC19923h;

/* JADX INFO: renamed from: Qg.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C6703N extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21535Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8870f f21536Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6703N(C8870f c8870f, int i10) {
        super(1);
        this.f21535Y = i10;
        this.f21536Z = c8870f;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f21535Y) {
            case 0:
                C6692C effect = (C6692C) obj;
                AbstractC16544l.m18094g(effect, "effect");
                if (effect instanceof C6692C) {
                    C8870f c8870f = this.f21536Z;
                    C8870f.m9548c(c8870f, c8870f.f27152e.m3160b(R.string.settings_memory_reset_success), null, 14);
                }
                return C17296C.f55119a;
            case 1:
                C8857s effect2 = (C8857s) obj;
                AbstractC16544l.m18094g(effect2, "effect");
                if (effect2 instanceof C8857s) {
                    C21795y c21795y = this.f21536Z.f27149b;
                    C5431w c5431w = C5431w.f17746g;
                    c5431w.getClass();
                    String sharedId = effect2.f27120a;
                    AbstractC16544l.m18094g(sharedId, "sharedId");
                    String id2 = effect2.f27121b;
                    AbstractC16544l.m18094g(id2, "id");
                    AbstractC5364G0.m5889d(c21795y, c5431w.m5885a(new C5393d(2, sharedId, id2)), true);
                }
                return C17296C.f55119a;
            case 2:
                C9506e effect3 = (C9506e) obj;
                AbstractC16544l.m18094g(effect3, "effect");
                if (effect3 instanceof C9506e) {
                    this.f21536Z.f27149b.m12195o();
                }
                return C17296C.f55119a;
            case 3:
                InterfaceC18179p effect4 = (InterfaceC18179p) obj;
                AbstractC16544l.m18094g(effect4, "effect");
                boolean z6 = effect4 instanceof C18178o;
                C8870f c8870f2 = this.f21536Z;
                if (z6) {
                    C8870f.m9547b(c8870f2, R.string.conversations_downloading_file);
                } else if (effect4 instanceof C18177n) {
                    C8870f.m9547b(c8870f2, AbstractC8106i0.m8589d(((C18177n) effect4).f57990a));
                }
                return C17296C.f55119a;
            case 4:
                String it = ((C21936L0) obj).f69488a;
                AbstractC16544l.m18094g(it, "it");
                AbstractC5364G0.m5889d(this.f21536Z.f27149b, C5376O.f17627i.m5898d(it), true);
                return C17296C.f55119a;
            case 5:
                String it2 = ((C21936L0) obj).f69488a;
                AbstractC16544l.m18094g(it2, "it");
                AbstractC5364G0.m5889d(this.f21536Z.f27149b, C5375N.f17626i.m5898d(it2), true);
                return C17296C.f55119a;
            case 6:
                C5950F DisposableEffect = (C5950F) obj;
                AbstractC16544l.m18094g(DisposableEffect, "$this$DisposableEffect");
                return new C0251g0(this.f21536Z, 13);
            default:
                InterfaceC19923h effect5 = (InterfaceC19923h) obj;
                AbstractC16544l.m18094g(effect5, "effect");
                boolean z10 = effect5 instanceof C19921f;
                C8870f c8870f3 = this.f21536Z;
                if (z10) {
                    c8870f3.f27149b.m12195o();
                } else if (effect5 instanceof C19922g) {
                    C8870f.m9547b(c8870f3, AbstractC8106i0.m8589d(((C19922g) effect5).f63180a));
                }
                return C17296C.f55119a;
        }
    }
}
