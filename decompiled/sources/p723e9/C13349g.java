package p723e9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p001A.C0076n;
import p470T4.CallableC7240e;
import p593Y8.C9682i;
import p604Yk.C10077b;
import p663b9.EnumC11264c;
import p745f9.C13589g;
import p767g9.InterfaceC13831b;
import p904nb.InterfaceC17550g;
import p904nb.RunnableC17548e;
import p904nb.ScheduledExecutorServiceC17549f;

/* JADX INFO: renamed from: e9.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13349g implements InterfaceC13831b, InterfaceC17550g {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42347Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f42348Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f42349o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f42350p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f42351q0;

    public /* synthetic */ C13349g(C13350h c13350h, Iterable iterable, C9682i c9682i, long j10) {
        this.f42347Y = 0;
        this.f42349o0 = c13350h;
        this.f42350p0 = iterable;
        this.f42351q0 = c9682i;
        this.f42348Z = j10;
    }

    @Override // p767g9.InterfaceC13831b
    /* JADX INFO: renamed from: a */
    public Object mo197a() {
        C13350h c13350h = (C13350h) this.f42349o0;
        C13589g c13589g = (C13589g) c13350h.f42354c;
        c13589g.getClass();
        Iterable iterable = (Iterable) this.f42350p0;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C13589g.m15104S(iterable);
            SQLiteDatabase sQLiteDatabaseM15109a = c13589g.m15109a();
            sQLiteDatabaseM15109a.beginTransaction();
            try {
                sQLiteDatabaseM15109a.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseM15109a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c13589g.m15107E(cursorRawQuery.getInt(0), EnumC11264c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseM15109a.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseM15109a.setTransactionSuccessful();
                sQLiteDatabaseM15109a.endTransaction();
            } catch (Throwable th3) {
                sQLiteDatabaseM15109a.endTransaction();
                throw th3;
            }
        }
        c13589g.m15110k(new C0076n(c13350h.f42358g.getTime() + this.f42348Z, (C9682i) this.f42351q0));
        return null;
    }

    @Override // p904nb.InterfaceC17550g
    /* JADX INFO: renamed from: b */
    public ScheduledFuture mo14939b(C10077b c10077b) {
        switch (this.f42347Y) {
            case 1:
                ScheduledExecutorServiceC17549f scheduledExecutorServiceC17549f = (ScheduledExecutorServiceC17549f) this.f42349o0;
                scheduledExecutorServiceC17549f.getClass();
                return scheduledExecutorServiceC17549f.f56148Z.schedule(new RunnableC17548e(scheduledExecutorServiceC17549f, (Runnable) this.f42350p0, c10077b, 1), this.f42348Z, (TimeUnit) this.f42351q0);
            default:
                ScheduledExecutorServiceC17549f scheduledExecutorServiceC17549f2 = (ScheduledExecutorServiceC17549f) this.f42349o0;
                scheduledExecutorServiceC17549f2.getClass();
                return scheduledExecutorServiceC17549f2.f56148Z.schedule(new CallableC7240e(scheduledExecutorServiceC17549f2, (Callable) this.f42350p0, c10077b, 3), this.f42348Z, (TimeUnit) this.f42351q0);
        }
    }

    public /* synthetic */ C13349g(ScheduledExecutorServiceC17549f scheduledExecutorServiceC17549f, Object obj, long j10, TimeUnit timeUnit, int i10) {
        this.f42347Y = i10;
        this.f42349o0 = scheduledExecutorServiceC17549f;
        this.f42350p0 = obj;
        this.f42348Z = j10;
        this.f42351q0 = timeUnit;
    }
}
