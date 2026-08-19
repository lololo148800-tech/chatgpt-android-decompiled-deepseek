package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.C15107A0;
import io.sentry.C15356g;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15142M;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import p544W9.AbstractC8459C3;
import p544W9.AbstractC8483G3;

/* JADX INFO: renamed from: io.sentry.android.core.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C15217h implements InterfaceC15142M {

    /* JADX INFO: renamed from: g */
    public final InterfaceC15127H f47479g;

    /* JADX INFO: renamed from: h */
    public final C15184B f47480h;

    /* JADX INFO: renamed from: a */
    public long f47473a = 0;

    /* JADX INFO: renamed from: b */
    public long f47474b = 0;

    /* JADX INFO: renamed from: c */
    public long f47475c = 1;

    /* JADX INFO: renamed from: d */
    public long f47476d = 1;

    /* JADX INFO: renamed from: e */
    public double f47477e = 1.0E9d / 1;

    /* JADX INFO: renamed from: f */
    public final File f47478f = new File("/proc/self/stat");

    /* JADX INFO: renamed from: i */
    public boolean f47481i = false;

    /* JADX INFO: renamed from: j */
    public final Pattern f47482j = Pattern.compile("[\n\t\r ]");

    public C15217h(InterfaceC15127H interfaceC15127H, C15184B c15184b) {
        AbstractC8483G3.m9133c(interfaceC15127H, "Logger is required.");
        this.f47479g = interfaceC15127H;
        this.f47480h = c15184b;
    }

    @Override // io.sentry.InterfaceC15142M
    /* JADX INFO: renamed from: a */
    public final void mo16318a(C15107A0 c15107a0) {
        this.f47480h.getClass();
        if (this.f47481i) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j10 = jElapsedRealtimeNanos - this.f47473a;
            this.f47473a = jElapsedRealtimeNanos;
            long jM16425b = m16425b();
            long j11 = jM16425b - this.f47474b;
            this.f47474b = jM16425b;
            c15107a0.f47005b = new C15356g(System.currentTimeMillis(), ((j11 / j10) / this.f47476d) * 100.0d);
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m16425b() {
        String strM9080d;
        InterfaceC15127H interfaceC15127H = this.f47479g;
        try {
            strM9080d = AbstractC8459C3.m9080d(this.f47478f);
        } catch (IOException e10) {
            this.f47481i = false;
            interfaceC15127H.mo16297h(EnumC15375i1.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e10);
            strM9080d = null;
        }
        if (strM9080d != null) {
            String[] strArrSplit = this.f47482j.split(strM9080d.trim());
            try {
                return (long) ((Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f47477e);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e11) {
                interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error parsing /proc/self/stat file.", e11);
            }
        }
        return 0L;
    }

    @Override // io.sentry.InterfaceC15142M
    /* JADX INFO: renamed from: c */
    public final void mo16319c() {
        this.f47480h.getClass();
        this.f47481i = true;
        this.f47475c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f47476d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f47477e = 1.0E9d / this.f47475c;
        this.f47474b = m16425b();
    }
}
