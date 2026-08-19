package p008A6;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p156G1.AbstractC2973t;
import p156G1.C2963j;
import p825j5.InterfaceC16130g;

/* JADX INFO: renamed from: A6.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0385e implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1293Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f1294Z;

    public /* synthetic */ C0385e(String str, int i10) {
        this.f1293Y = i10;
        this.f1294Z = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f1293Y) {
            case 0:
                InterfaceC16130g execute = (InterfaceC16130g) obj;
                String key = this.f1294Z;
                AbstractC16544l.m18094g(key, "$key");
                AbstractC16544l.m18094g(execute, "$this$execute");
                execute.mo17682c(0, key);
                break;
            default:
                C2963j c2963j = (C2963j) obj;
                AbstractC2973t.m3811f(c2963j, this.f1294Z);
                AbstractC2973t.m3812g(c2963j, 5);
                break;
        }
        return C17296C.f55119a;
    }
}
