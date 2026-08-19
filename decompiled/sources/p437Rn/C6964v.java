package p437Rn;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0227a;

/* JADX INFO: renamed from: Rn.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C6964v implements InterfaceC6958p {

    /* JADX INFO: renamed from: a */
    public final C0227a f22269a;

    /* JADX INFO: renamed from: b */
    public final String f22270b;

    public C6964v(C0227a c0227a, String whatThisExpects) {
        AbstractC16544l.m18094g(whatThisExpects, "whatThisExpects");
        this.f22269a = c0227a;
        this.f22270b = whatThisExpects;
    }

    @Override // p437Rn.InterfaceC6958p
    /* JADX INFO: renamed from: a */
    public final Object mo7330a(InterfaceC6945c interfaceC6945c, String input, int i10) {
        AbstractC16544l.m18094g(input, "input");
        if (i10 >= input.length()) {
            return Integer.valueOf(i10);
        }
        char cCharAt = input.charAt(i10);
        C0227a c0227a = this.f22269a;
        if (cCharAt == '-') {
            c0227a.invoke(interfaceC6945c, Boolean.TRUE);
            return Integer.valueOf(i10 + 1);
        }
        if (cCharAt != '+') {
            return new C6952j(i10, new C6963u(this, cCharAt));
        }
        c0227a.invoke(interfaceC6945c, Boolean.FALSE);
        return Integer.valueOf(i10 + 1);
    }

    public final String toString() {
        return this.f22270b;
    }
}
