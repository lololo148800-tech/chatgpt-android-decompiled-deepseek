package io.sentry;

import java.io.File;
import java.util.concurrent.TimeUnit;
import p544W9.AbstractC8459C3;

/* JADX INFO: renamed from: io.sentry.O0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15149O0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47159Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ File f47160Z;

    public /* synthetic */ RunnableC15149O0(File file, int i10) {
        this.f47159Y = i10;
        this.f47160Z = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47159Y) {
            case 0:
                File[] fileArrListFiles = this.f47160Z.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (file.lastModified() < AbstractC15152P0.f47168e - TimeUnit.MINUTES.toMillis(5L)) {
                            AbstractC8459C3.m9077a(file);
                        }
                    }
                    break;
                }
                break;
            default:
                AbstractC8459C3.m9077a(this.f47160Z);
                break;
        }
    }
}
