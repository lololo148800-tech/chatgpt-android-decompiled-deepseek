package p109E3;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: renamed from: E3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2284h extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final ContentResolver f7057a;

    /* JADX INFO: renamed from: b */
    public final Uri f7058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2286j f7059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2284h(C2286j c2286j, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f7059c = c2286j;
        this.f7057a = contentResolver;
        this.f7058b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        C2286j c2286j = this.f7059c;
        c2286j.m3379a(C2281e.m3373c(c2286j.f7062a, c2286j.f7070i, c2286j.f7069h));
    }
}
