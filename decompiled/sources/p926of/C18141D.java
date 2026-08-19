package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p040Bd.AbstractC0985Q1;

/* JADX INFO: renamed from: of.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C18141D implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final String f57878a;

    /* JADX INFO: renamed from: b */
    public final String f57879b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0985Q1 f57880c;

    /* JADX INFO: renamed from: d */
    public final Integer f57881d;

    public C18141D(String str, String messageId, AbstractC0985Q1 ref, Integer num) {
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(ref, "ref");
        this.f57878a = str;
        this.f57879b = messageId;
        this.f57880c = ref;
        this.f57881d = num;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18141D)) {
            return false;
        }
        C18141D c18141d = (C18141D) obj;
        String str = c18141d.f57878a;
        String str2 = this.f57878a;
        if (str2 == null) {
            if (str == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str2, str);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f57879b, c18141d.f57879b) && AbstractC16544l.m18089b(this.f57880c, c18141d.f57880c) && AbstractC16544l.m18089b(this.f57881d, c18141d.f57881d);
    }

    public final int hashCode() {
        String str = this.f57878a;
        int iHashCode = (this.f57880c.hashCode() + AbstractC0168G.m527p((str == null ? 0 : str.hashCode()) * 31, 31, this.f57879b)) * 31;
        Integer num = this.f57881d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
