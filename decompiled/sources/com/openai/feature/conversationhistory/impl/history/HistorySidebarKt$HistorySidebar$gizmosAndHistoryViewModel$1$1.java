package com.openai.feature.conversationhistory.impl.history;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1062vd.C20572v;
import p1062vd.C20573w;
import p1062vd.C20574x;
import p1062vd.C20575y;
import p1062vd.InterfaceC20576z;
import p318Mh.AbstractC5364G0;
import p318Mh.C5431w;
import p553Wh.C8870f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lvd/z;", "effect", "Lmm/C;", "invoke", "(Lvd/z;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class HistorySidebarKt$HistorySidebar$gizmosAndHistoryViewModel$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C8870f f37510Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistorySidebarKt$HistorySidebar$gizmosAndHistoryViewModel$1$1(C8870f c8870f) {
        super(1);
        this.f37510Y = c8870f;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC20576z effect = (InterfaceC20576z) obj;
        AbstractC16544l.m18094g(effect, "effect");
        boolean z6 = effect instanceof C20572v;
        C8870f c8870f = this.f37510Y;
        if (z6) {
            AbstractC5364G0.m5889d(c8870f.f27149b, C5431w.f17746g.m5903d(((C20572v) effect).f65300a), true);
        } else if (effect instanceof C20573w) {
            AbstractC5364G0.m5889d(c8870f.f27149b, C5431w.m5901e(C5431w.f17746g, ((C20573w) effect).f65301a, null, null, 6), true);
        } else if (effect instanceof C20575y) {
            AbstractC5364G0.m5889d(c8870f.f27149b, C5431w.m5901e(C5431w.f17746g, ((C20575y) effect).f65303a, null, "snorlax", 2), false);
        } else if (effect instanceof C20574x) {
            AbstractC5364G0.m5889d(c8870f.f27149b, C5431w.m5902f(C5431w.f17746g, null, null, false, false, 15), true);
        }
        return C17296C.f55119a;
    }
}
