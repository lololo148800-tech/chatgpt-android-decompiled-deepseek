package io.sentry.protocol;

import io.sentry.C15396j1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C15451x implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: A0 */
    public String f48239A0;

    /* JADX INFO: renamed from: B0 */
    public ConcurrentHashMap f48240B0;

    /* JADX INFO: renamed from: C0 */
    public String f48241C0;

    /* JADX INFO: renamed from: D0 */
    public C15396j1 f48242D0;

    /* JADX INFO: renamed from: Y */
    public String f48243Y;

    /* JADX INFO: renamed from: Z */
    public String f48244Z;

    /* JADX INFO: renamed from: o0 */
    public String f48245o0;

    /* JADX INFO: renamed from: p0 */
    public Integer f48246p0;

    /* JADX INFO: renamed from: q0 */
    public Integer f48247q0;

    /* JADX INFO: renamed from: r0 */
    public String f48248r0;

    /* JADX INFO: renamed from: s0 */
    public String f48249s0;

    /* JADX INFO: renamed from: t0 */
    public Boolean f48250t0;

    /* JADX INFO: renamed from: u0 */
    public String f48251u0;

    /* JADX INFO: renamed from: v0 */
    public Boolean f48252v0;

    /* JADX INFO: renamed from: w0 */
    public String f48253w0;

    /* JADX INFO: renamed from: x0 */
    public String f48254x0;

    /* JADX INFO: renamed from: y0 */
    public String f48255y0;

    /* JADX INFO: renamed from: z0 */
    public String f48256z0;

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48243Y != null) {
            c11248s.m12668o("filename");
            c11248s.m12660D(this.f48243Y);
        }
        if (this.f48244Z != null) {
            c11248s.m12668o("function");
            c11248s.m12660D(this.f48244Z);
        }
        if (this.f48245o0 != null) {
            c11248s.m12668o("module");
            c11248s.m12660D(this.f48245o0);
        }
        if (this.f48246p0 != null) {
            c11248s.m12668o("lineno");
            c11248s.m12659B(this.f48246p0);
        }
        if (this.f48247q0 != null) {
            c11248s.m12668o("colno");
            c11248s.m12659B(this.f48247q0);
        }
        if (this.f48248r0 != null) {
            c11248s.m12668o("abs_path");
            c11248s.m12660D(this.f48248r0);
        }
        if (this.f48249s0 != null) {
            c11248s.m12668o("context_line");
            c11248s.m12660D(this.f48249s0);
        }
        if (this.f48250t0 != null) {
            c11248s.m12668o("in_app");
            c11248s.m12658A(this.f48250t0);
        }
        if (this.f48251u0 != null) {
            c11248s.m12668o("package");
            c11248s.m12660D(this.f48251u0);
        }
        if (this.f48252v0 != null) {
            c11248s.m12668o("native");
            c11248s.m12658A(this.f48252v0);
        }
        if (this.f48253w0 != null) {
            c11248s.m12668o("platform");
            c11248s.m12660D(this.f48253w0);
        }
        if (this.f48254x0 != null) {
            c11248s.m12668o("image_addr");
            c11248s.m12660D(this.f48254x0);
        }
        if (this.f48255y0 != null) {
            c11248s.m12668o("symbol_addr");
            c11248s.m12660D(this.f48255y0);
        }
        if (this.f48256z0 != null) {
            c11248s.m12668o("instruction_addr");
            c11248s.m12660D(this.f48256z0);
        }
        if (this.f48241C0 != null) {
            c11248s.m12668o("raw_function");
            c11248s.m12660D(this.f48241C0);
        }
        if (this.f48239A0 != null) {
            c11248s.m12668o("symbol");
            c11248s.m12660D(this.f48239A0);
        }
        if (this.f48242D0 != null) {
            c11248s.m12668o("lock");
            c11248s.m12677z(interfaceC15127H, this.f48242D0);
        }
        ConcurrentHashMap concurrentHashMap = this.f48240B0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48240B0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
