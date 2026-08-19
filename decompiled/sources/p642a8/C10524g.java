package p642a8;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p588Y2.C9642z;
import p765g7.InterfaceC13823a;
import p828j8.C16176a;
import p960q9.C18655i;

/* JADX INFO: renamed from: a8.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10524g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31207Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10525h f31208Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10524g(C10525h c10525h, int i10) {
        super(0);
        this.f31207Y = i10;
        this.f31208Z = c10525h;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f31207Y) {
            case 0:
                C10525h c10525h = this.f31208Z;
                InterfaceC1436k interfaceC1436k = c10525h.f31223o0;
                InterfaceC13823a interfaceC13823a = c10525h.f31221Y;
                AbstractC16544l.m18092e(interfaceC13823a, "null cannot be cast to non-null type com.datadog.android.core.InternalSdkCore");
                return (InterfaceC10520c) interfaceC1436k.invoke(interfaceC13823a);
            default:
                C10525h c10525h2 = this.f31208Z;
                String str = c10525h2.f31222Z.f31186a;
                InterfaceC13823a interfaceC13823a2 = c10525h2.f31221Y;
                return new C16176a(str, new C18655i(new C9642z(interfaceC13823a2.mo15463s()), 27), interfaceC13823a2.mo15463s());
        }
    }
}
