package p346Nn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p016Ae.C0439a;
import p324Mn.AbstractC5547q;
import p324Mn.C5554x;
import p437Rn.InterfaceC6945c;
import p817j$.time.DayOfWeek;
import p817j$.time.LocalDate;

/* JADX INFO: renamed from: Nn.F */
/* JADX INFO: loaded from: classes2.dex */
public final class C5866F implements InterfaceC5898g, InterfaceC6945c {

    /* JADX INFO: renamed from: a */
    public Integer f19173a;

    /* JADX INFO: renamed from: b */
    public Integer f19174b;

    /* JADX INFO: renamed from: c */
    public Integer f19175c;

    /* JADX INFO: renamed from: d */
    public Integer f19176d;

    public C5866F(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f19173a = num;
        this.f19174b = num2;
        this.f19175c = num3;
        this.f19176d = num4;
    }

    @Override // p437Rn.InterfaceC6945c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5866F mo6257a() {
        return new C5866F(this.f19173a, this.f19174b, this.f19175c, this.f19176d);
    }

    /* JADX INFO: renamed from: c */
    public final C5554x m6259c() {
        Integer num = this.f19173a;
        AbstractC5873M.m6303a(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = this.f19174b;
        AbstractC5873M.m6303a(num2, "monthNumber");
        int iIntValue2 = num2.intValue();
        Integer num3 = this.f19175c;
        AbstractC5873M.m6303a(num3, "dayOfMonth");
        C5554x c5554x = new C5554x(iIntValue, iIntValue2, num3.intValue());
        Integer num4 = this.f19176d;
        if (num4 != null) {
            int iIntValue3 = num4.intValue();
            LocalDate localDate = c5554x.f18006Y;
            DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            AbstractC16544l.m18093f(dayOfWeek, "getDayOfWeek(...)");
            if (iIntValue3 != dayOfWeek.ordinal() + 1) {
                StringBuilder sb2 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                if (1 > iIntValue3 || iIntValue3 >= 8) {
                    throw new IllegalArgumentException(AbstractC10763a.m11048f(iIntValue3, "Expected ISO day-of-week number in 1..7, got ").toString());
                }
                sb2.append((DayOfWeek) AbstractC5547q.f17999a.get(iIntValue3 - 1));
                sb2.append(" but the date is ");
                sb2.append(c5554x);
                sb2.append(", which is a ");
                DayOfWeek dayOfWeek2 = localDate.getDayOfWeek();
                AbstractC16544l.m18093f(dayOfWeek2, "getDayOfWeek(...)");
                sb2.append(dayOfWeek2);
                throw new C0439a(sb2.toString(), 1);
            }
        }
        return c5554x;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: e */
    public final void mo6260e(Integer num) {
        this.f19174b = num;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5866F) {
            C5866F c5866f = (C5866F) obj;
            if (AbstractC16544l.m18089b(this.f19173a, c5866f.f19173a) && AbstractC16544l.m18089b(this.f19174b, c5866f.f19174b) && AbstractC16544l.m18089b(this.f19175c, c5866f.f19175c) && AbstractC16544l.m18089b(this.f19176d, c5866f.f19176d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f19173a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f19174b;
        int iHashCode2 = ((num2 != null ? num2.hashCode() : 0) * 31) + iHashCode;
        Integer num3 = this.f19175c;
        int iHashCode3 = ((num3 != null ? num3.hashCode() : 0) * 31) + iHashCode2;
        Integer num4 = this.f19176d;
        return ((num4 != null ? num4.hashCode() : 0) * 31) + iHashCode3;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: j */
    public final Integer mo6261j() {
        return this.f19173a;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: k */
    public final void mo6262k(Integer num) {
        this.f19175c = num;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: n */
    public final Integer mo6263n() {
        return this.f19176d;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: o */
    public final void mo6264o(Integer num) {
        this.f19173a = num;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: q */
    public final Integer mo6265q() {
        return this.f19175c;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: r */
    public final Integer mo6266r() {
        return this.f19174b;
    }

    @Override // p346Nn.InterfaceC5898g
    /* JADX INFO: renamed from: t */
    public final void mo6267t(Integer num) {
        this.f19176d = num;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Object obj = this.f19173a;
        if (obj == null) {
            obj = "??";
        }
        sb2.append(obj);
        sb2.append('-');
        Object obj2 = this.f19174b;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb2.append(obj2);
        sb2.append('-');
        Object obj3 = this.f19175c;
        if (obj3 == null) {
            obj3 = "??";
        }
        sb2.append(obj3);
        sb2.append(" (day of week is ");
        Integer num = this.f19176d;
        sb2.append(num != null ? num : "??");
        sb2.append(')');
        return sb2.toString();
    }
}
