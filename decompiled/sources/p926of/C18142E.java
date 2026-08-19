package p926of;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: of.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C18142E implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final String f57882a;

    /* JADX INFO: renamed from: b */
    public final String f57883b;

    /* JADX INFO: renamed from: c */
    public final List f57884c;

    public C18142E(String str, String messageId, List refs) {
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(refs, "refs");
        this.f57882a = str;
        this.f57883b = messageId;
        this.f57884c = refs;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18142E)) {
            return false;
        }
        C18142E c18142e = (C18142E) obj;
        String str = c18142e.f57882a;
        String str2 = this.f57882a;
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
        return zM18089b && AbstractC16544l.m18089b(this.f57883b, c18142e.f57883b) && AbstractC16544l.m18089b(this.f57884c, c18142e.f57884c);
    }

    public final int hashCode() {
        String str = this.f57882a;
        return this.f57884c.hashCode() + AbstractC0168G.m527p((str == null ? 0 : str.hashCode()) * 31, 31, this.f57883b);
    }

    public final String toString() {
        return "█";
    }
}
