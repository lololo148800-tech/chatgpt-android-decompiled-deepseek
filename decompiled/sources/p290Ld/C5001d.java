package p290Ld;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p593Y8.C9683j;
import p801i5.C14932d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ld.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C5001d extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f16315Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f16316Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f16317o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C9683j f16318p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5001d(long j10, long j11, C9683j c9683j, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f16316Z = j10;
        this.f16317o0 = j11;
        this.f16318p0 = c9683j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C5001d(this.f16316Z, this.f16317o0, this.f16318p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C5001d) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0071 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C14932d c14932dM10277e;
        C14932d c14932dM10277e2;
        C14932d c14932dM10277e3;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f16315Y;
        C9683j c9683j = this.f16318p0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            if (this.f16316Z <= 1 && this.f16317o0 > 1) {
                C14932d c14932dM10277e4 = c9683j.m10277e(null, "DELETE FROM DBConversation", null);
                this.f16315Y = 1;
                if (c14932dM10277e4.f46522b == enumC19250a) {
                    return enumC19250a;
                }
                c14932dM10277e = c9683j.m10277e(null, "CREATE TABLE DBMessage (\n    id TEXT NOT NULL PRIMARY KEY,\n    conversationId TEXT NOT NULL,\n    messageNode TEXT NOT NULL,\n    FOREIGN KEY (conversationId)\n       REFERENCES DBConversation (id)\n       ON DELETE CASCADE\n       ON UPDATE RESTRICT\n)", null);
                this.f16315Y = 2;
                if (c14932dM10277e.f46522b == enumC19250a) {
                    return enumC19250a;
                }
                c14932dM10277e2 = c9683j.m10277e(null, "CREATE INDEX message_id ON DBMessage(id)", null);
                this.f16315Y = 3;
                if (c14932dM10277e2.f46522b == enumC19250a) {
                    return enumC19250a;
                }
                c14932dM10277e3 = c9683j.m10277e(null, "CREATE INDEX message_conversation_id ON DBMessage(conversationId)", null);
                this.f16315Y = 4;
                if (c14932dM10277e3.f46522b == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else if (i10 == 1) {
            AbstractC9233X.m9807c(obj);
            c14932dM10277e = c9683j.m10277e(null, "CREATE TABLE DBMessage (\n    id TEXT NOT NULL PRIMARY KEY,\n    conversationId TEXT NOT NULL,\n    messageNode TEXT NOT NULL,\n    FOREIGN KEY (conversationId)\n       REFERENCES DBConversation (id)\n       ON DELETE CASCADE\n       ON UPDATE RESTRICT\n)", null);
            this.f16315Y = 2;
            if (c14932dM10277e.f46522b == enumC19250a) {
                return enumC19250a;
            }
            c14932dM10277e2 = c9683j.m10277e(null, "CREATE INDEX message_id ON DBMessage(id)", null);
            this.f16315Y = 3;
            if (c14932dM10277e2.f46522b == enumC19250a) {
                return enumC19250a;
            }
            c14932dM10277e3 = c9683j.m10277e(null, "CREATE INDEX message_conversation_id ON DBMessage(conversationId)", null);
            this.f16315Y = 4;
            if (c14932dM10277e3.f46522b == enumC19250a) {
                return enumC19250a;
            }
        } else if (i10 == 2) {
            AbstractC9233X.m9807c(obj);
            c14932dM10277e2 = c9683j.m10277e(null, "CREATE INDEX message_id ON DBMessage(id)", null);
            this.f16315Y = 3;
            if (c14932dM10277e2.f46522b == enumC19250a) {
                return enumC19250a;
            }
            c14932dM10277e3 = c9683j.m10277e(null, "CREATE INDEX message_conversation_id ON DBMessage(conversationId)", null);
            this.f16315Y = 4;
            if (c14932dM10277e3.f46522b == enumC19250a) {
                return enumC19250a;
            }
        } else if (i10 == 3) {
            AbstractC9233X.m9807c(obj);
            c14932dM10277e3 = c9683j.m10277e(null, "CREATE INDEX message_conversation_id ON DBMessage(conversationId)", null);
            this.f16315Y = 4;
            if (c14932dM10277e3.f46522b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
