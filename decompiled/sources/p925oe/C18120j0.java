package p925oe;

import ao.C11158d;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1155zi.C22003f0;
import p559Wn.InterfaceC8975g;
import p909nm.C17691y;

/* JADX INFO: renamed from: oe.j0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18120j0 {
    public static final C18118i0 Companion = new C18118i0();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f57800c = {new C11158d(C22003f0.f69641a, 2), new C11158d(C18104b0.f57751a, 2)};

    /* JADX INFO: renamed from: a */
    public final Set f57801a;

    /* JADX INFO: renamed from: b */
    public final Set f57802b;

    public /* synthetic */ C18120j0(int i10, Set set, Set set2) {
        int i11 = i10 & 1;
        C17691y c17691y = C17691y.f56482Y;
        if (i11 == 0) {
            this.f57801a = c17691y;
        } else {
            this.f57801a = set;
        }
        if ((i10 & 2) == 0) {
            this.f57802b = c17691y;
        } else {
            this.f57802b = set2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18120j0 m19715a(C18120j0 c18120j0, Set set) {
        Set unreadConversationIds = c18120j0.f57801a;
        c18120j0.getClass();
        AbstractC16544l.m18094g(unreadConversationIds, "unreadConversationIds");
        return new C18120j0(unreadConversationIds, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18120j0)) {
            return false;
        }
        C18120j0 c18120j0 = (C18120j0) obj;
        return AbstractC16544l.m18089b(this.f57801a, c18120j0.f57801a) && AbstractC16544l.m18089b(this.f57802b, c18120j0.f57802b);
    }

    public final int hashCode() {
        return this.f57802b.hashCode() + (this.f57801a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C18120j0(Set unreadConversationIds, Set unreadConversations) {
        AbstractC16544l.m18094g(unreadConversationIds, "unreadConversationIds");
        AbstractC16544l.m18094g(unreadConversations, "unreadConversations");
        this.f57801a = unreadConversationIds;
        this.f57802b = unreadConversations;
    }
}
