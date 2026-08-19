package p360Od;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p403Qd.EnumC6606L;
import p559Wn.InterfaceC8975g;
import p575Xd.C9463v;

/* JADX INFO: renamed from: Od.d */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6172d {
    public static final C6171c Companion = new C6171c();

    /* JADX INFO: renamed from: f */
    public static final KSerializer[] f20090f = {null, null, AbstractC11153a0.m12383f("com.openai.feature.conversations.domain.actions.CustomAction.ActionState", EnumC6170b.values()), AbstractC11153a0.m12383f("com.openai.feature.conversations.domain.conversation.ToolConversationStatus", EnumC6606L.values()), null};

    /* JADX INFO: renamed from: a */
    public final C9463v f20091a;

    /* JADX INFO: renamed from: b */
    public final String f20092b;

    /* JADX INFO: renamed from: c */
    public final EnumC6170b f20093c;

    /* JADX INFO: renamed from: d */
    public final EnumC6606L f20094d;

    /* JADX INFO: renamed from: e */
    public final boolean f20095e;

    public /* synthetic */ C6172d(int i10, C9463v c9463v, String str, EnumC6170b enumC6170b, EnumC6606L enumC6606L, boolean z6) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C6169a.f20084a.getDescriptor());
            throw null;
        }
        this.f20091a = c9463v;
        this.f20092b = str;
        if ((i10 & 4) == 0) {
            this.f20093c = EnumC6170b.f20088p0;
        } else {
            this.f20093c = enumC6170b;
        }
        if ((i10 & 8) == 0) {
            this.f20094d = EnumC6606L.f21327Y;
        } else {
            this.f20094d = enumC6606L;
        }
        if ((i10 & 16) == 0) {
            this.f20095e = false;
        } else {
            this.f20095e = z6;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C6172d m6722a(C6172d c6172d, EnumC6170b enumC6170b, EnumC6606L toolStatus, int i10) {
        C9463v details = c6172d.f20091a;
        String str = c6172d.f20092b;
        if ((i10 & 4) != 0) {
            enumC6170b = c6172d.f20093c;
        }
        EnumC6170b actionState = enumC6170b;
        boolean z6 = c6172d.f20095e;
        c6172d.getClass();
        AbstractC16544l.m18094g(details, "details");
        AbstractC16544l.m18094g(actionState, "actionState");
        AbstractC16544l.m18094g(toolStatus, "toolStatus");
        return new C6172d(details, str, actionState, toolStatus, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6172d)) {
            return false;
        }
        C6172d c6172d = (C6172d) obj;
        return AbstractC16544l.m18089b(this.f20091a, c6172d.f20091a) && AbstractC16544l.m18089b(this.f20092b, c6172d.f20092b) && this.f20093c == c6172d.f20093c && this.f20094d == c6172d.f20094d && this.f20095e == c6172d.f20095e;
    }

    public final int hashCode() {
        int iHashCode = this.f20091a.hashCode() * 31;
        String str = this.f20092b;
        return ((this.f20094d.hashCode() + ((this.f20093c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31) + (this.f20095e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C6172d(C9463v c9463v, String str, EnumC6170b actionState, EnumC6606L toolStatus, boolean z6) {
        AbstractC16544l.m18094g(actionState, "actionState");
        AbstractC16544l.m18094g(toolStatus, "toolStatus");
        this.f20091a = c9463v;
        this.f20092b = str;
        this.f20093c = actionState;
        this.f20094d = toolStatus;
        this.f20095e = z6;
    }

    public /* synthetic */ C6172d(C9463v c9463v, String str, EnumC6606L enumC6606L, int i10) {
        this(c9463v, str, EnumC6170b.f20085Y, (i10 & 8) != 0 ? EnumC6606L.f21327Y : enumC6606L, false);
    }
}
