package ie;

import android.app.Application;
import mm.C17314q;
import ni.C17628b;
import ni.C17642p;
import p017Af.C0494y;
import p195Hh.C3430e;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9227W;
import p722e8.C13298H;
import p948pi.C18418a;

/* JADX INFO: renamed from: ie.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C14975d {

    /* JADX INFO: renamed from: a */
    public final C18418a f46630a;

    /* JADX INFO: renamed from: b */
    public final C3430e f46631b = AbstractC8168p6.m8749b("ConversationDatabaseProvider", null);

    /* JADX INFO: renamed from: c */
    public final C17314q f46632c = AbstractC9227W.m9800c(new C13298H(this, 16));

    /* JADX INFO: renamed from: d */
    public final C17314q f46633d;

    public C14975d(Application application, C18418a c18418a, C17628b c17628b, C17642p c17642p) {
        this.f46630a = c18418a;
        this.f46633d = AbstractC9227W.m9800c(new C0494y(this, application, c17628b, c17642p, 14));
    }
}
