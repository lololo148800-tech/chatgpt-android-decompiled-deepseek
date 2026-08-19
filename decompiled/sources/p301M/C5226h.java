package p301M;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p001A.C0076n;
import p003A1.AbstractC0168G;
import p221Ii.RunnableC3724c;
import p277L.ScheduledExecutorServiceC4831d;
import p544W9.AbstractC8577W2;
import p593Y8.C9682i;
import p610Z1.C10142i;
import p610Z1.C10144k;
import p610Z1.C10145l;
import p610Z1.InterfaceC10143j;
import p663b9.EnumC11264c;
import p723e9.C13350h;
import p745f9.C13589g;
import p745f9.InterfaceC13587e;
import p747fb.InterfaceFutureC13608b;
import p767g9.InterfaceC13831b;

/* JADX INFO: renamed from: M.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5226h implements InterfaceC10143j, InterfaceC13831b, InterfaceC13587e {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16968Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f16969Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f16970o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f16971p0;

    public /* synthetic */ C5226h(Object obj, Object obj2, long j10, int i10) {
        this.f16968Y = i10;
        this.f16971p0 = obj;
        this.f16969Z = obj2;
        this.f16970o0 = j10;
    }

    @Override // p767g9.InterfaceC13831b
    /* JADX INFO: renamed from: a */
    public Object mo197a() {
        C13350h c13350h = (C13350h) this.f16971p0;
        long time = c13350h.f42358g.getTime() + this.f16970o0;
        C13589g c13589g = (C13589g) c13350h.f42354c;
        C9682i c9682i = (C9682i) this.f16969Z;
        c13589g.getClass();
        c13589g.m15110k(new C0076n(time, c9682i));
        return null;
    }

    @Override // p745f9.InterfaceC13587e
    /* JADX INFO: renamed from: apply */
    public Object mo22420apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((EnumC11264c) this.f16969Z).f34129Y;
        String string = Integer.toString(i10);
        String str = (String) this.f16971p0;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string});
        try {
            boolean z6 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j10 = this.f16970o0;
            if (z6) {
                sQLiteDatabase.execSQL(AbstractC0168G.m533v("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", j10, " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i10));
                contentValues.put("events_dropped_count", Long.valueOf(j10));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            }
            return null;
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(final C10142i c10142i) {
        switch (this.f16968Y) {
            case 0:
                C10145l c10145l = (C10145l) this.f16971p0;
                AbstractC5229k.m5781e(true, c10145l, c10142i, AbstractC8577W2.m9240b());
                C10144k c10144k = c10145l.f30070Z;
                if (!c10144k.isDone()) {
                    final ScheduledFuture scheduledFutureSchedule = ((ScheduledExecutorServiceC4831d) this.f16969Z).schedule(new RunnableC3724c(c10142i, 7, c10145l), this.f16970o0, TimeUnit.MILLISECONDS);
                    final int i10 = 1;
                    c10144k.mo5766a(new Runnable() { // from class: M.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    scheduledFutureSchedule.cancel(true);
                                    break;
                                default:
                                    scheduledFutureSchedule.cancel(true);
                                    break;
                            }
                        }
                    }, AbstractC8577W2.m9240b());
                }
                return "TimeoutFuture[" + c10145l + "]";
            default:
                final InterfaceFutureC13608b interfaceFutureC13608b = (InterfaceFutureC13608b) this.f16971p0;
                AbstractC5229k.m5781e(true, interfaceFutureC13608b, c10142i, AbstractC8577W2.m9240b());
                if (!interfaceFutureC13608b.isDone()) {
                    final long j10 = this.f16970o0;
                    final ScheduledFuture scheduledFutureSchedule2 = ((ScheduledExecutorServiceC4831d) this.f16969Z).schedule(new Callable() { // from class: M.e
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(c10142i.m10748b(new TimeoutException("Future[" + interfaceFutureC13608b + "] is not done within " + j10 + " ms.")));
                        }
                    }, j10, TimeUnit.MILLISECONDS);
                    final int i11 = 0;
                    interfaceFutureC13608b.mo5766a(new Runnable() { // from class: M.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    scheduledFutureSchedule2.cancel(true);
                                    break;
                                default:
                                    scheduledFutureSchedule2.cancel(true);
                                    break;
                            }
                        }
                    }, AbstractC8577W2.m9240b());
                }
                return "TimeoutFuture[" + interfaceFutureC13608b + "]";
        }
    }
}
