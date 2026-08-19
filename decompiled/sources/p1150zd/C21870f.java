package p1150zd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zd.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21870f {
    public static final C21869e Companion = new C21869e();

    /* JADX INFO: renamed from: f */
    public static final KSerializer[] f69344f = {null, null, EnumC21867c.Companion.serializer(), null, new C11158d(EnumC21875k.Companion.serializer(), 0)};

    /* JADX INFO: renamed from: a */
    public final String f69345a;

    /* JADX INFO: renamed from: b */
    public final String f69346b;

    /* JADX INFO: renamed from: c */
    public final EnumC21867c f69347c;

    /* JADX INFO: renamed from: d */
    public final String f69348d;

    /* JADX INFO: renamed from: e */
    public final List f69349e;

    public C21870f(String conversationId, String messageId, EnumC21867c enumC21867c, String str, List list) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(messageId, "messageId");
        this.f69345a = conversationId;
        this.f69346b = messageId;
        this.f69347c = enumC21867c;
        this.f69348d = str;
        this.f69349e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21870f)) {
            return false;
        }
        C21870f c21870f = (C21870f) obj;
        return AbstractC16544l.m18089b(this.f69345a, c21870f.f69345a) && AbstractC16544l.m18089b(this.f69346b, c21870f.f69346b) && this.f69347c == c21870f.f69347c && AbstractC16544l.m18089b(this.f69348d, c21870f.f69348d) && AbstractC16544l.m18089b(this.f69349e, c21870f.f69349e);
    }

    public final int hashCode() {
        int iHashCode = (this.f69347c.hashCode() + AbstractC0168G.m527p(this.f69345a.hashCode() * 31, 31, this.f69346b)) * 31;
        String str = this.f69348d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f69349e;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C21870f(int i10, String str, String str2, EnumC21867c enumC21867c, String str3, List list) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C21868d.f69343a.getDescriptor());
            throw null;
        }
        this.f69345a = str;
        this.f69346b = str2;
        this.f69347c = enumC21867c;
        this.f69348d = str3;
        if ((i10 & 16) == 0) {
            this.f69349e = null;
        } else {
            this.f69349e = list;
        }
    }
}
