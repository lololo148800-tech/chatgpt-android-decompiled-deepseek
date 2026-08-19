package p707dg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: dg.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13113i {
    public static final C13112h Companion = new C13112h();

    /* JADX INFO: renamed from: a */
    public final String f41632a;

    /* JADX INFO: renamed from: b */
    public final String f41633b;

    /* JADX INFO: renamed from: c */
    public final String f41634c;

    /* JADX INFO: renamed from: d */
    public final int f41635d;

    /* JADX INFO: renamed from: e */
    public final boolean f41636e;

    public C13113i(String phoneNumber, String countryIso) {
        AbstractC16544l.m18094g(phoneNumber, "phoneNumber");
        AbstractC16544l.m18094g(countryIso, "countryIso");
        this.f41632a = phoneNumber;
        this.f41633b = "sms";
        this.f41634c = countryIso;
        this.f41635d = 1;
        this.f41636e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13113i)) {
            return false;
        }
        C13113i c13113i = (C13113i) obj;
        return AbstractC16544l.m18089b(this.f41632a, c13113i.f41632a) && AbstractC16544l.m18089b(this.f41633b, c13113i.f41633b) && AbstractC16544l.m18089b(this.f41634c, c13113i.f41634c) && this.f41635d == c13113i.f41635d && this.f41636e == c13113i.f41636e;
    }

    public final int hashCode() {
        return ((AbstractC0168G.m527p(AbstractC0168G.m527p(this.f41632a.hashCode() * 31, 31, this.f41633b), 31, this.f41634c) + this.f41635d) * 31) + (this.f41636e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C13113i(int i10, int i11, String str, String str2, String str3, boolean z6) {
        if (5 != (i10 & 5)) {
            AbstractC11153a0.m12389l(i10, 5, C13111g.f41631a.getDescriptor());
            throw null;
        }
        this.f41632a = str;
        if ((i10 & 2) == 0) {
            this.f41633b = "sms";
        } else {
            this.f41633b = str2;
        }
        this.f41634c = str3;
        if ((i10 & 8) == 0) {
            this.f41635d = 1;
        } else {
            this.f41635d = i11;
        }
        if ((i10 & 16) == 0) {
            this.f41636e = true;
        } else {
            this.f41636e = z6;
        }
    }
}
