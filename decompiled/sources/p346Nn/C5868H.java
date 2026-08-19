package p346Nn;

import kotlin.jvm.internal.AbstractC16544l;
import p016Ae.C0439a;
import p1113xn.AbstractC21322p;
import p324Mn.C5523D;
import p369On.C6272a;
import p437Rn.InterfaceC6945c;
import p817j$.time.DateTimeException;
import p817j$.time.LocalTime;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Nn.H */
/* JADX INFO: loaded from: classes2.dex */
public final class C5868H implements InterfaceC5901h0, InterfaceC6945c {

    /* JADX INFO: renamed from: a */
    public Integer f19179a;

    /* JADX INFO: renamed from: b */
    public Integer f19180b;

    /* JADX INFO: renamed from: c */
    public EnumC5896f f19181c;

    /* JADX INFO: renamed from: d */
    public Integer f19182d;

    /* JADX INFO: renamed from: e */
    public Integer f19183e;

    /* JADX INFO: renamed from: f */
    public Integer f19184f;

    public /* synthetic */ C5868H() {
        this(null, null, null, null, null, null);
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: B */
    public final void mo6268B(C6272a c6272a) {
        this.f19184f = c6272a != null ? Integer.valueOf(c6272a.m6753a(9)) : null;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: b */
    public final EnumC5896f mo6269b() {
        return this.f19181c;
    }

    @Override // p437Rn.InterfaceC6945c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C5868H mo6257a() {
        return new C5868H(this.f19179a, this.f19180b, this.f19181c, this.f19182d, this.f19183e, this.f19184f);
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: d */
    public final void mo6270d(Integer num) {
        this.f19180b = num;
    }

    /* JADX INFO: renamed from: e */
    public final C5523D m6281e() {
        int iIntValue;
        int iIntValue2;
        Integer num = this.f19179a;
        if (num != null) {
            iIntValue = num.intValue();
            Integer num2 = this.f19180b;
            if (num2 != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = num2.intValue())) {
                throw new IllegalArgumentException(AbstractC17792x.m19534q("Inconsistent hour and hour-of-am-pm: hour is ", iIntValue, iIntValue2, ", but hour-of-am-pm is ").toString());
            }
            EnumC5896f enumC5896f = this.f19181c;
            if (enumC5896f != null) {
                if ((enumC5896f == EnumC5896f.f19224Y) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + enumC5896f).toString());
                }
            }
        } else {
            Integer num3 = this.f19180b;
            Integer numValueOf = null;
            if (num3 != null) {
                int iIntValue3 = num3.intValue();
                EnumC5896f enumC5896f2 = this.f19181c;
                if (enumC5896f2 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (enumC5896f2 != EnumC5896f.f19224Y ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new C0439a("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        Integer num4 = this.f19182d;
        AbstractC5873M.m6303a(num4, "minute");
        int iIntValue4 = num4.intValue();
        Integer num5 = this.f19183e;
        int iIntValue5 = num5 != null ? num5.intValue() : 0;
        Integer num6 = this.f19184f;
        try {
            LocalTime localTimeM16853of = LocalTime.m16853of(iIntValue, iIntValue4, iIntValue5, num6 != null ? num6.intValue() : 0);
            AbstractC16544l.m18091d(localTimeM16853of);
            return new C5523D(localTimeM16853of);
        } catch (DateTimeException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5868H) {
            C5868H c5868h = (C5868H) obj;
            if (AbstractC16544l.m18089b(this.f19179a, c5868h.f19179a) && AbstractC16544l.m18089b(this.f19180b, c5868h.f19180b) && this.f19181c == c5868h.f19181c && AbstractC16544l.m18089b(this.f19182d, c5868h.f19182d) && AbstractC16544l.m18089b(this.f19183e, c5868h.f19183e) && AbstractC16544l.m18089b(this.f19184f, c5868h.f19184f)) {
                return true;
            }
        }
        return false;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: f */
    public final void mo6271f(EnumC5896f enumC5896f) {
        this.f19181c = enumC5896f;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: h */
    public final Integer mo6272h() {
        return this.f19182d;
    }

    public final int hashCode() {
        Integer num = this.f19179a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.f19180b;
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + iIntValue;
        EnumC5896f enumC5896f = this.f19181c;
        int iHashCode = ((enumC5896f != null ? enumC5896f.hashCode() : 0) * 31) + iIntValue2;
        Integer num3 = this.f19182d;
        int iIntValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + iHashCode;
        Integer num4 = this.f19183e;
        int iIntValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + iIntValue3;
        Integer num5 = this.f19184f;
        return iIntValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: i */
    public final void mo6273i(Integer num) {
        this.f19182d = num;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: l */
    public final C6272a mo6274l() {
        Integer num = this.f19184f;
        if (num != null) {
            return new C6272a(num.intValue(), 9);
        }
        return null;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: m */
    public final Integer mo6275m() {
        return this.f19180b;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: s */
    public final void mo6276s(Integer num) {
        this.f19179a = num;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    public final String toString() {
        String strM21686T;
        StringBuilder sb2 = new StringBuilder();
        Object obj = this.f19179a;
        if (obj == null) {
            obj = "??";
        }
        sb2.append(obj);
        sb2.append(':');
        Object obj2 = this.f19182d;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb2.append(obj2);
        sb2.append(':');
        Integer num = this.f19183e;
        sb2.append(num != null ? num : "??");
        sb2.append('.');
        Integer num2 = this.f19184f;
        if (num2 != null) {
            String strValueOf = String.valueOf(num2.intValue());
            strM21686T = AbstractC21322p.m21686T(9 - strValueOf.length(), strValueOf);
            if (strM21686T == null) {
                strM21686T = "???";
            }
        } else {
            strM21686T = "???";
        }
        sb2.append(strM21686T);
        return sb2.toString();
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: u */
    public final Integer mo6277u() {
        return this.f19179a;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: x */
    public final Integer mo6278x() {
        return this.f19183e;
    }

    @Override // p346Nn.InterfaceC5901h0
    /* JADX INFO: renamed from: z */
    public final void mo6279z(Integer num) {
        this.f19183e = num;
    }

    public C5868H(Integer num, Integer num2, EnumC5896f enumC5896f, Integer num3, Integer num4, Integer num5) {
        this.f19179a = num;
        this.f19180b = num2;
        this.f19181c = enumC5896f;
        this.f19182d = num3;
        this.f19183e = num4;
        this.f19184f = num5;
    }
}
