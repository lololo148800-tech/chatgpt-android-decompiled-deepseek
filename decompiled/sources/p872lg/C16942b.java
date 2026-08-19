package p872lg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: lg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16942b extends AbstractC16943c {

    /* JADX INFO: renamed from: a */
    public final String f54391a;

    /* JADX INFO: renamed from: b */
    public final EnumC16949i f54392b;

    public C16942b(String inquiryId, EnumC16949i inquiryStatus) {
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(inquiryStatus, "inquiryStatus");
        this.f54391a = inquiryId;
        this.f54392b = inquiryStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16942b)) {
            return false;
        }
        C16942b c16942b = (C16942b) obj;
        return AbstractC16544l.m18089b(this.f54391a, c16942b.f54391a) && this.f54392b == c16942b.f54392b;
    }

    public final int hashCode() {
        return this.f54392b.hashCode() + (this.f54391a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
