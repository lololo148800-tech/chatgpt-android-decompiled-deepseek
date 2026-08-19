package androidx.work;

import android.content.Context;
import p003A1.RunnableC0153B;
import p301M.RunnableC5228j;
import p444S4.AbstractC7010p;
import p444S4.C7008n;
import p697d5.C13027j;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends AbstractC7010p {

    /* JADX INFO: renamed from: q0 */
    public C13027j f33695q0;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // p444S4.AbstractC7010p
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC13608b mo7404a() {
        C13027j c13027j = new C13027j();
        this.f22417Z.f33699d.execute(new RunnableC5228j(this, c13027j, false, 7));
        return c13027j;
    }

    @Override // p444S4.AbstractC7010p
    /* JADX INFO: renamed from: d */
    public final C13027j mo7406d() {
        this.f33695q0 = new C13027j();
        this.f22417Z.f33699d.execute(new RunnableC0153B(this, 12));
        return this.f33695q0;
    }

    /* JADX INFO: renamed from: f */
    public abstract C7008n mo12336f();
}
