package p742f6;

import io.sentry.internal.debugmeta.C15384c;
import java.io.EOFException;
import java.util.ArrayList;
import p232J3.C4206F;
import p520V5.C7781j;
import p523V9.AbstractC7846A5;
import p591Y5.C9659j;
import p604Yk.C10077b;
import p660b6.C11250b;
import p660b6.C11251c;
import p660b6.InterfaceC11253e;
import p764g6.C13822b;
import p779h6.AbstractC14418g;
import p802i6.C14935a;

/* JADX INFO: renamed from: f6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13549a {

    /* JADX INFO: renamed from: a */
    public static final C15384c f42872a = C15384c.m16635u("k", "x", "y");

    /* JADX INFO: renamed from: a */
    public static C10077b m15087a(C13822b c13822b, C7781j c7781j) throws C4206F, EOFException {
        ArrayList arrayList = new ArrayList();
        if (c13822b.mo15424P() == 1) {
            c13822b.mo15429a();
            while (c13822b.hasNext()) {
                arrayList.add(new C9659j(c7781j, AbstractC13563o.m15096b(c13822b, c7781j, AbstractC14418g.m15932c(), C13554f.f42884q0, c13822b.mo15424P() == 3, false)));
            }
            c13822b.mo15433k();
            AbstractC13564p.m15098b(arrayList);
        } else {
            arrayList.add(new C14935a(AbstractC13562n.m15092b(c13822b, AbstractC14418g.m15932c())));
        }
        return new C10077b(arrayList, 3);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC11253e m15088b(C13822b c13822b, C7781j c7781j) throws C4206F, EOFException {
        c13822b.mo15430e();
        C10077b c10077bM15087a = null;
        C11250b c11250bM8100c = null;
        boolean z6 = false;
        C11250b c11250bM8100c2 = null;
        while (c13822b.mo15424P() != 4) {
            int iMo15427T = c13822b.mo15427T(f42872a);
            if (iMo15427T == 0) {
                c10077bM15087a = m15087a(c13822b, c7781j);
            } else if (iMo15427T != 1) {
                if (iMo15427T != 2) {
                    c13822b.mo15428W();
                    c13822b.mo15421D();
                } else if (c13822b.mo15424P() == 6) {
                    c13822b.mo15421D();
                    z6 = true;
                } else {
                    c11250bM8100c = AbstractC7846A5.m8100c(c13822b, c7781j, true);
                }
            } else if (c13822b.mo15424P() == 6) {
                c13822b.mo15421D();
                z6 = true;
            } else {
                c11250bM8100c2 = AbstractC7846A5.m8100c(c13822b, c7781j, true);
            }
        }
        c13822b.mo15434m();
        if (z6) {
            c7781j.m8039a("Lottie doesn't support expressions.");
        }
        return c10077bM15087a != null ? c10077bM15087a : new C11251c(c11250bM8100c2, c11250bM8100c);
    }
}
