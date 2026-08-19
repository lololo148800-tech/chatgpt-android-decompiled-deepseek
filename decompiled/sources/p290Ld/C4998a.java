package p290Ld;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p593Y8.C9683j;
import p801i5.C14932d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ld.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4998a extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f16308Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9683j f16309Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4998a(C9683j c9683j, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f16309Z = c9683j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C4998a(this.f16309Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C4998a) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C14932d c14932dM10277e;
        C14932d c14932dM10277e2;
        C14932d c14932dM10277e3;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f16308Y;
        C9683j c9683j = this.f16309Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                AbstractC9233X.m9807c(obj);
                c14932dM10277e = c9683j.m10277e(null, "CREATE INDEX conversation_id ON DBConversation(id)", null);
                this.f16308Y = 3;
                if (c14932dM10277e.f46522b == enumC19250a) {
                    return enumC19250a;
                }
                c14932dM10277e2 = c9683j.m10277e(null, "CREATE INDEX message_id ON DBMessage(id)", null);
                this.f16308Y = 4;
                if (c14932dM10277e2.f46522b == enumC19250a) {
                    return enumC19250a;
                }
                c14932dM10277e3 = c9683j.m10277e(null, "CREATE INDEX message_conversation_id ON DBMessage(conversationId)", null);
                this.f16308Y = 5;
                if (c14932dM10277e3.f46522b == enumC19250a) {
                    return enumC19250a;
                }
            } else if (i10 == 3) {
                AbstractC9233X.m9807c(obj);
                c14932dM10277e2 = c9683j.m10277e(null, "CREATE INDEX message_id ON DBMessage(id)", null);
                this.f16308Y = 4;
                if (c14932dM10277e2.f46522b == enumC19250a) {
                    return enumC19250a;
                }
                c14932dM10277e3 = c9683j.m10277e(null, "CREATE INDEX message_conversation_id ON DBMessage(conversationId)", null);
                this.f16308Y = 5;
                if (c14932dM10277e3.f46522b == enumC19250a) {
                    return enumC19250a;
                }
            } else if (i10 == 4) {
                AbstractC9233X.m9807c(obj);
                c14932dM10277e3 = c9683j.m10277e(null, "CREATE INDEX message_conversation_id ON DBMessage(conversationId)", null);
                this.f16308Y = 5;
                if (c14932dM10277e3.f46522b == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C14932d c14932dM10277e4 = c9683j.m10277e(null, "CREATE TABLE DBConversation (\n    id TEXT NOT NULL PRIMARY KEY,\n    conversation TEXT NOT NULL\n)", null);
        this.f16308Y = 1;
        if (c14932dM10277e4.f46522b == enumC19250a) {
            return enumC19250a;
        }
        C14932d c14932dM10277e5 = c9683j.m10277e(null, "CREATE TABLE DBMessage (\n    id TEXT NOT NULL PRIMARY KEY,\n    conversationId TEXT NOT NULL,\n    messageNode TEXT NOT NULL,\n    FOREIGN KEY (conversationId)\n       REFERENCES DBConversation (id)\n       ON DELETE CASCADE\n       ON UPDATE RESTRICT\n)", null);
        this.f16308Y = 2;
        if (c14932dM10277e5.f46522b == enumC19250a) {
            return enumC19250a;
        }
        c14932dM10277e = c9683j.m10277e(null, "CREATE INDEX conversation_id ON DBConversation(id)", null);
        this.f16308Y = 3;
        if (c14932dM10277e.f46522b == enumC19250a) {
            return enumC19250a;
        }
        c14932dM10277e2 = c9683j.m10277e(null, "CREATE INDEX message_id ON DBMessage(id)", null);
        this.f16308Y = 4;
        if (c14932dM10277e2.f46522b == enumC19250a) {
            return enumC19250a;
        }
        c14932dM10277e3 = c9683j.m10277e(null, "CREATE INDEX message_conversation_id ON DBMessage(conversationId)", null);
        this.f16308Y = 5;
        if (c14932dM10277e3.f46522b == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
