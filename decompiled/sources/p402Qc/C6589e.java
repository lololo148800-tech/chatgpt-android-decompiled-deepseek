package p402Qc;

import io.sentry.internal.debugmeta.C15384c;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p292Lg.C5034f;
import p571X9.AbstractC9233X;
import p593Y8.C9683j;
import p658b5.C11232c;
import p763g5.AbstractC13819d;
import p801i5.C14932d;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Qc.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C6589e extends AbstractC13819d {

    /* JADX INFO: renamed from: o0 */
    public final Object f21290o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6589e(C9683j c9683j, C11232c DBConversationAdapter) {
        super(c9683j);
        AbstractC16544l.m18094g(DBConversationAdapter, "DBConversationAdapter");
        this.f21290o0 = DBConversationAdapter;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: R */
    public Object m7154R(String str, AbstractC19687c abstractC19687c) {
        C6585a c6585a;
        C6589e c6589e;
        if (abstractC19687c instanceof C6585a) {
            c6585a = (C6585a) abstractC19687c;
            int i10 = c6585a.f21275p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6585a.f21275p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6585a = new C6585a(this, abstractC19687c);
            }
        } else {
            c6585a = new C6585a(this, abstractC19687c);
        }
        Object obj = c6585a.f21273Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6585a.f21275p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C14932d c14932dM10277e = ((C9683j) this.f11539Z).m10277e(new Integer(-127674581), "DELETE\nFROM DBConversation\nWHERE id = ?", new C5034f(this, 15, str));
            c6585a.f21272Y = this;
            c6585a.f21275p0 = 1;
            if (c14932dM10277e.f46522b == enumC19250a) {
                return enumC19250a;
            }
            c6589e = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6589e = c6585a.f21272Y;
            AbstractC9233X.m9807c(obj);
        }
        c6589e.m4519J(-127674581, C6586b.f21276Z);
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: S */
    public Object m7155S(AbstractC19687c abstractC19687c) {
        C6587c c6587c;
        C6589e c6589e;
        if (abstractC19687c instanceof C6587c) {
            c6587c = (C6587c) abstractC19687c;
            int i10 = c6587c.f21285p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6587c.f21285p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6587c = new C6587c(this, abstractC19687c);
            }
        } else {
            c6587c = new C6587c(this, abstractC19687c);
        }
        Object obj = c6587c.f21283Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6587c.f21285p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C14932d c14932dM10277e = ((C9683j) this.f11539Z).m10277e(new Integer(1787647606), "DELETE\nFROM DBConversation", null);
            c6587c.f21282Y = this;
            c6587c.f21285p0 = 1;
            if (c14932dM10277e.f46522b == enumC19250a) {
                return enumC19250a;
            }
            c6589e = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6589e = c6587c.f21282Y;
            AbstractC9233X.m9807c(obj);
        }
        c6589e.m4519J(1787647606, C6586b.f21277o0);
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: T */
    public Object m7156T(String str, AbstractC19687c abstractC19687c) {
        C6592h c6592h;
        C6589e c6589e;
        if (abstractC19687c instanceof C6592h) {
            c6592h = (C6592h) abstractC19687c;
            int i10 = c6592h.f21299p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6592h.f21299p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6592h = new C6592h(this, abstractC19687c);
            }
        } else {
            c6592h = new C6592h(this, abstractC19687c);
        }
        Object obj = c6592h.f21297Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6592h.f21299p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C14932d c14932dM10277e = ((C9683j) this.f11539Z).m10277e(new Integer(750218886), "DELETE\nFROM DBMessage\nWHERE conversationId = ?", new C5034f(this, 18, str));
            c6592h.f21296Y = this;
            c6592h.f21299p0 = 1;
            if (c14932dM10277e.f46522b == enumC19250a) {
                return enumC19250a;
            }
            c6589e = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6589e = c6592h.f21296Y;
            AbstractC9233X.m9807c(obj);
        }
        c6589e.m4519J(750218886, C6586b.f21279q0);
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: U */
    public Object m7157U(C6590f c6590f, AbstractC19687c abstractC19687c) {
        C6588d c6588d;
        C6589e c6589e;
        if (abstractC19687c instanceof C6588d) {
            c6588d = (C6588d) abstractC19687c;
            int i10 = c6588d.f21289p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6588d.f21289p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6588d = new C6588d(this, abstractC19687c);
            }
        } else {
            c6588d = new C6588d(this, abstractC19687c);
        }
        Object obj = c6588d.f21287Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6588d.f21289p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C14932d c14932dM10277e = ((C9683j) this.f11539Z).m10277e(new Integer(1113158397), "INSERT OR REPLACE\nINTO DBConversation (id, conversation)\nVALUES (?, ?)", new C5034f(this, 16, c6590f));
            c6588d.f21286Y = this;
            c6588d.f21289p0 = 1;
            if (c14932dM10277e.f46522b == enumC19250a) {
                return enumC19250a;
            }
            c6589e = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6589e = c6588d.f21286Y;
            AbstractC9233X.m9807c(obj);
        }
        c6589e.m4519J(1113158397, C6586b.f21278p0);
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: V */
    public Object m7158V(C6591g c6591g, AbstractC19687c abstractC19687c) {
        C6594j c6594j;
        C6589e c6589e;
        if (abstractC19687c instanceof C6594j) {
            c6594j = (C6594j) abstractC19687c;
            int i10 = c6594j.f21305p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6594j.f21305p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6594j = new C6594j(this, abstractC19687c);
            }
        } else {
            c6594j = new C6594j(this, abstractC19687c);
        }
        Object obj = c6594j.f21303Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6594j.f21305p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C14932d c14932dM10277e = ((C9683j) this.f11539Z).m10277e(new Integer(1180159107), "INSERT OR REPLACE\nINTO DBMessage (id, conversationId, messageNode)\nVALUES (?, ?, ?)", new C5034f(this, 19, c6591g));
            c6594j.f21302Y = this;
            c6594j.f21305p0 = 1;
            if (c14932dM10277e.f46522b == enumC19250a) {
                return enumC19250a;
            }
            c6589e = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6589e = c6594j.f21302Y;
            AbstractC9233X.m9807c(obj);
        }
        c6589e.m4519J(1180159107, C6586b.f21280r0);
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6589e(C9683j c9683j, C15384c DBMessageAdapter) {
        super(c9683j);
        AbstractC16544l.m18094g(DBMessageAdapter, "DBMessageAdapter");
        this.f21290o0 = DBMessageAdapter;
    }
}
