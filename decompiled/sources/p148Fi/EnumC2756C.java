package p148Fi;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v3 Fi.C[], still in use, count: 1, list:
  (r14v3 Fi.C[]) from 0x006b: INVOKE (r14v3 Fi.C[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:109)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: Fi.C */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC2756C {
    Unknown("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    EF20("state_update"),
    /* JADX INFO: Fake field, exist only in values array */
    UsageUpdate("usage_update"),
    /* JADX INFO: Fake field, exist only in values array */
    ConversationUpdate("conversation_update"),
    /* JADX INFO: Fake field, exist only in values array */
    StreamingMessageUpdate("streaming_message_update"),
    /* JADX INFO: Fake field, exist only in values array */
    SpeakingUpdate("speaking_update"),
    /* JADX INFO: Fake field, exist only in values array */
    Performance("performance"),
    /* JADX INFO: Fake field, exist only in values array */
    ToolUpdate("tool_update");


    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C20007b f8451p0;

    /* JADX INFO: renamed from: Y */
    public final String f8452Y;
    public static final C2754B Companion = new C2754B();

    /* JADX INFO: renamed from: Z */
    public static final Object f8449Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C2815e.f8544o0);

    public EnumC2756C(String str) {
        super(str, i);
        this.f8452Y = str;
    }

    public static EnumC2756C valueOf(String str) {
        return (EnumC2756C) Enum.valueOf(EnumC2756C.class, str);
    }

    public static EnumC2756C[] values() {
        return (EnumC2756C[]) f8450o0.clone();
    }

    static {
        f8451p0 = AbstractC7877E4.m8156j(new EnumC2756C[]{r0, new EnumC2756C("state_update"), new EnumC2756C("usage_update"), new EnumC2756C("conversation_update"), new EnumC2756C("streaming_message_update"), new EnumC2756C("speaking_update"), new EnumC2756C("performance"), new EnumC2756C("tool_update")});
    }
}
