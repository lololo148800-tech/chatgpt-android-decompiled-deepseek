package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.c1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15326c1 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public final String f47868Y;

    /* JADX INFO: renamed from: Z */
    public final String f47869Z;

    /* JADX INFO: renamed from: o0 */
    public final EnumC15361h1 f47870o0;

    /* JADX INFO: renamed from: p0 */
    public final int f47871p0;

    /* JADX INFO: renamed from: q0 */
    public final Callable f47872q0;

    /* JADX INFO: renamed from: r0 */
    public final String f47873r0;

    /* JADX INFO: renamed from: s0 */
    public HashMap f47874s0;

    public C15326c1(EnumC15361h1 enumC15361h1, int i10, String str, String str2, String str3) {
        this.f47870o0 = enumC15361h1;
        this.f47868Y = str;
        this.f47871p0 = i10;
        this.f47869Z = str2;
        this.f47872q0 = null;
        this.f47873r0 = str3;
    }

    /* JADX INFO: renamed from: a */
    public final int m16534a() {
        Callable callable = this.f47872q0;
        if (callable == null) {
            return this.f47871p0;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        String str = this.f47868Y;
        if (str != null) {
            c11248s.m12668o("content_type");
            c11248s.m12660D(str);
        }
        String str2 = this.f47869Z;
        if (str2 != null) {
            c11248s.m12668o("filename");
            c11248s.m12660D(str2);
        }
        c11248s.m12668o("type");
        c11248s.m12677z(interfaceC15127H, this.f47870o0);
        String str3 = this.f47873r0;
        if (str3 != null) {
            c11248s.m12668o("attachment_type");
            c11248s.m12660D(str3);
        }
        c11248s.m12668o("length");
        c11248s.m12676y(m16534a());
        HashMap map = this.f47874s0;
        if (map != null) {
            for (String str4 : map.keySet()) {
                AbstractC14376f.m15826E(this.f47874s0, str4, c11248s, str4, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }

    public C15326c1(EnumC15361h1 enumC15361h1, Callable callable, String str, String str2, String str3) {
        AbstractC8483G3.m9133c(enumC15361h1, "type is required");
        this.f47870o0 = enumC15361h1;
        this.f47868Y = str;
        this.f47871p0 = -1;
        this.f47869Z = str2;
        this.f47872q0 = callable;
        this.f47873r0 = str3;
    }
}
