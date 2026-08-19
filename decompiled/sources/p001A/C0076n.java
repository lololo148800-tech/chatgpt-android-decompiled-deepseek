package p001A;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.camera2.TotalCaptureResult;
import io.sentry.instrumentation.file.C15378c;
import io.sentry.instrumentation.file.InterfaceC15376a;
import p522V8.EnumC7837d;
import p593Y8.C9682i;
import p610Z1.C10142i;
import p610Z1.InterfaceC10143j;
import p745f9.InterfaceC13587e;
import p805i9.AbstractC14950a;

/* JADX INFO: renamed from: A.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0076n implements InterfaceC10143j, InterfaceC13587e, InterfaceC15376a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ long f316Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f317Z;

    public /* synthetic */ C0076n(long j10, C9682i c9682i) {
        this.f316Y = j10;
        this.f317Z = c9682i;
    }

    @Override // p745f9.InterfaceC13587e
    /* JADX INFO: renamed from: apply */
    public Object mo22420apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f316Y));
        C9682i c9682i = (C9682i) this.f317Z;
        String str = c9682i.f29188a;
        EnumC7837d enumC7837d = c9682i.f29190c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC14950a.m16111a(enumC7837d))}) < 1) {
            contentValues.put("backend_name", c9682i.f29188a);
            contentValues.put("priority", Integer.valueOf(AbstractC14950a.m16111a(enumC7837d)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(final C10142i c10142i) {
        C0088t c0088t = (C0088t) this.f317Z;
        c0088t.getClass();
        final long j10 = this.f316Y;
        c0088t.m297a(new InterfaceC0086s() { // from class: A.g
            @Override // p001A.InterfaceC0086s
            /* JADX INFO: renamed from: b */
            public final boolean mo3b(TotalCaptureResult totalCaptureResult) {
                if (!C0088t.m294n(totalCaptureResult, j10)) {
                    return false;
                }
                c10142i.m10747a(null);
                return true;
            }
        });
        return "waitForSessionUpdateId:" + j10;
    }

    @Override // io.sentry.instrumentation.file.InterfaceC15376a
    public Object call() {
        return Long.valueOf(((C15378c) this.f317Z).f47961Y.skip(this.f316Y));
    }

    public /* synthetic */ C0076n(long j10, Object obj) {
        this.f317Z = obj;
        this.f316Y = j10;
    }
}
