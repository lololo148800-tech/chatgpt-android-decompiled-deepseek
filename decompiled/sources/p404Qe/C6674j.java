package p404Qe;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p968qi.C18726i;
import p968qi.C18729l;
import p968qi.C18737t;
import p968qi.C18742y;

/* JADX INFO: renamed from: Qe.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C6674j extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21453Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18737t f21454Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6674j(C18737t c18737t, int i10) {
        super(1);
        this.f21453Y = i10;
        this.f21454Z = c18737t;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f21453Y) {
            case 0:
                return AbstractC10763a.m11054l(Separators.DOUBLE_QUOTE, ((C18729l) ((C18742y) this.f21454Z.f59597a.get(0)).f59616b.get(((Number) obj).intValue())).f59571a, Separators.DOUBLE_QUOTE);
            default:
                long j10 = ((C18726i) obj).f59568a;
                return ((int) (j10 >> 32)) + ",\"" + ((C18729l) ((C18742y) this.f21454Z.f59597a.get(0)).f59616b.get((int) (4294967295L & j10))).f59571a + Separators.DOUBLE_QUOTE;
        }
    }
}
