package ge;

import android.content.ClipData;
import android.net.Uri;
import bf.C11349D;
import bf.InterfaceC11374b0;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mh.C17257e;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1025te.C19851B;
import p1025te.C19861L;
import p1042uh.C20263a0;
import p1062vd.C20529I;
import p1062vd.C20533M;
import p1062vd.C20538S;
import p1095x1.InterfaceC21098s;
import p1155zi.C21936L0;
import p571X9.AbstractC9393x3;
import p810ig.AbstractC14993l;
import p825j5.InterfaceC16130g;
import p926of.C18184u;
import pf.C18392h;
import tf.C19924i;

/* JADX INFO: renamed from: ge.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14089m0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44322Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f44323Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14089m0(int i10, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f44322Y = i10;
        this.f44323Z = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        boolean z6;
        switch (this.f44322Y) {
            case 0:
                String it = (String) obj;
                AbstractC16544l.m18094g(it, "it");
                this.f44323Z.invoke(new C18184u(it));
                return C17296C.f55119a;
            case 1:
                ((Boolean) obj).booleanValue();
                this.f44323Z.invoke(C14092o.f44327a);
                return C17296C.f55119a;
            case 2:
                String it2 = (String) obj;
                AbstractC16544l.m18094g(it2, "it");
                this.f44323Z.invoke(AbstractC14993l.m16133d(it2));
                return C17296C.f55119a;
            case 3:
                String value = (String) obj;
                AbstractC16544l.m18094g(value, "value");
                this.f44323Z.invoke(AbstractC14993l.m16133d(value));
                return C17296C.f55119a;
            case 4:
                InterfaceC16130g execute = (InterfaceC16130g) obj;
                AbstractC16544l.m18094g(execute, "$this$execute");
                return execute.mo17681b(this.f44323Z);
            case 5:
                ClipData.Item item = (ClipData.Item) obj;
                AbstractC16544l.m18094g(item, "item");
                Uri uri = item.getUri();
                if (uri != null) {
                    this.f44323Z.invoke(new C19861L(AbstractC9393x3.m9974d(uri)));
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 6:
                C20263a0 it3 = (C20263a0) obj;
                AbstractC16544l.m18094g(it3, "it");
                this.f44323Z.invoke(new C19851B(it3));
                return C17296C.f55119a;
            case 7:
                AbstractC16544l.m18094g((InterfaceC21098s) obj, "it");
                this.f44323Z.invoke(C14023E.f44110a);
                return C17296C.f55119a;
            case 8:
                C17257e effect = (C17257e) obj;
                AbstractC16544l.m18094g(effect, "effect");
                if (effect instanceof C17257e) {
                    this.f44323Z.invoke(effect.f55053a);
                }
                return C17296C.f55119a;
            case 9:
                throw AbstractC12107L1.m13822m(obj);
            case 10:
                this.f44323Z.invoke(new C18392h(((Number) obj).longValue()));
                return C17296C.f55119a;
            case 11:
                this.f44323Z.invoke(new C19924i(((Boolean) obj).booleanValue()));
                return C17296C.f55119a;
            case 12:
                String it4 = ((C21936L0) obj).f69488a;
                AbstractC16544l.m18094g(it4, "it");
                this.f44323Z.invoke(new C20533M(it4));
                return C17296C.f55119a;
            case 13:
                String it5 = ((C21936L0) obj).f69488a;
                AbstractC16544l.m18094g(it5, "it");
                this.f44323Z.invoke(new C20538S(it5));
                return C17296C.f55119a;
            default:
                InterfaceC11374b0 snorlax = (InterfaceC11374b0) obj;
                AbstractC16544l.m18094g(snorlax, "snorlax");
                this.f44323Z.invoke(new C20529I(((C11349D) snorlax).f34318a));
                return C17296C.f55119a;
        }
    }
}
