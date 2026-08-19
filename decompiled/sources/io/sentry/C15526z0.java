package io.sentry;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.sentry.android.core.C15188F;
import io.sentry.hints.InterfaceC15367f;
import io.sentry.hints.InterfaceC15368g;
import io.sentry.hints.InterfaceC15371j;
import io.sentry.protocol.C15421A;
import io.sentry.protocol.C15430c;
import io.sentry.protocol.C15445r;
import io.sentry.protocol.C15447t;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import p117Eb.C2391u;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8477F3;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8489H3;
import p658b5.C11241l;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: io.sentry.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15526z0 extends AbstractC15403m {

    /* JADX INFO: renamed from: i */
    public static final Charset f48486i = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e */
    public final C15109B f48487e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC15121F f48488f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC15151P f48489g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC15127H f48490h;

    public C15526z0(C15109B c15109b, InterfaceC15121F interfaceC15121F, InterfaceC15151P interfaceC15151P, InterfaceC15127H interfaceC15127H, long j10, int i10) {
        super(c15109b, interfaceC15127H, j10, i10);
        AbstractC8483G3.m9133c(c15109b, "Hub is required.");
        this.f48487e = c15109b;
        AbstractC8483G3.m9133c(interfaceC15121F, "Envelope reader is required.");
        this.f48488f = interfaceC15121F;
        AbstractC8483G3.m9133c(interfaceC15151P, "Serializer is required.");
        this.f48489g = interfaceC15151P;
        AbstractC8483G3.m9133c(interfaceC15127H, "Logger is required.");
        this.f48490h = interfaceC15127H;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m16733c(C15526z0 c15526z0, File file, InterfaceC15368g interfaceC15368g) {
        InterfaceC15127H interfaceC15127H = c15526z0.f48490h;
        if (interfaceC15368g.mo16388a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            interfaceC15127H.mo16298o(EnumC15375i1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e10) {
            interfaceC15127H.mo16296g(EnumC15375i1.ERROR, e10, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.AbstractC15403m
    /* JADX INFO: renamed from: a */
    public final boolean mo16650a(String str) {
        return (str == null || str.startsWith(ParameterNames.SESSION) || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        m16733c(r8, r9, (io.sentry.hints.InterfaceC15368g) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        return;
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException
     */
    @Override // io.sentry.AbstractC15403m
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo16651b(File file, C15516w c15516w) {
        Object objM9088b;
        boolean zMo16650a = mo16650a(file.getName());
        InterfaceC15127H interfaceC15127H = this.f48490h;
        try {
            if (!zMo16650a) {
                interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    C11241l c11241lMo16262a = this.f48488f.mo16262a(bufferedInputStream);
                    if (c11241lMo16262a == null) {
                        interfaceC15127H.mo16298o(EnumC15375i1.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        m16735e(c11241lMo16262a, c15516w);
                        interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    objM9088b = AbstractC8465D3.m9088b(c15516w);
                    if (InterfaceC15368g.class.isInstance(AbstractC8465D3.m9088b(c15516w))) {
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error processing envelope.", e10);
                objM9088b = AbstractC8465D3.m9088b(c15516w);
                if (InterfaceC15368g.class.isInstance(AbstractC8465D3.m9088b(c15516w))) {
                }
                AbstractC8477F3.m9114d(InterfaceC15368g.class, objM9088b, interfaceC15127H);
            }
            AbstractC8477F3.m9114d(InterfaceC15368g.class, objM9088b, interfaceC15127H);
        } catch (Throwable th4) {
            Object objM9088b2 = AbstractC8465D3.m9088b(c15516w);
            if (!InterfaceC15368g.class.isInstance(AbstractC8465D3.m9088b(c15516w)) || objM9088b2 == null) {
                AbstractC8477F3.m9114d(InterfaceC15368g.class, objM9088b2, interfaceC15127H);
            } else {
                m16733c(this, file, (InterfaceC15368g) objM9088b2);
            }
            throw th4;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public final C2391u m16734d(C15158R1 c15158r1) {
        String str;
        InterfaceC15127H interfaceC15127H = this.f48490h;
        if (c15158r1 != null && (str = c15158r1.f47189t0) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (AbstractC8489H3.m9146d(dValueOf, false)) {
                    return new C2391u(Boolean.TRUE, dValueOf);
                }
                interfaceC15127H.mo16298o(EnumC15375i1.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                interfaceC15127H.mo16298o(EnumC15375i1.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new C2391u(Boolean.TRUE, (Double) null);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m16736f(C15516w c15516w) {
        Object objM9088b = AbstractC8465D3.m9088b(c15516w);
        if (objM9088b instanceof InterfaceC15367f) {
            return ((InterfaceC15367f) objM9088b).mo16391d();
        }
        AbstractC8477F3.m9114d(InterfaceC15367f.class, objM9088b, this.f48490h);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m16735e(C11241l c11241l, C15516w c15516w) {
        int size;
        Iterator it;
        Throwable th2;
        char c9;
        int i10;
        C11241l c11241l2 = c11241l;
        char c10 = 0;
        int i11 = 1;
        EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
        Collection collection = (Collection) c11241l2.f34017Z;
        if (collection instanceof Collection) {
            size = collection.size();
        } else {
            Iterator it2 = collection.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                it2.next();
                i12++;
            }
            size = i12;
        }
        Object[] objArr = {Integer.valueOf(size)};
        InterfaceC15127H interfaceC15127H = this.f48490h;
        interfaceC15127H.mo16298o(enumC15375i1, "Processing Envelope with %d item(s)", objArr);
        Iterator it3 = collection.iterator();
        int i13 = 0;
        while (it3.hasNext()) {
            C15321b1 c15321b1 = (C15321b1) it3.next();
            int i14 = i13 + 1;
            C15326c1 c15326c1 = c15321b1.f47863a;
            if (c15326c1 == null) {
                EnumC15375i1 enumC15375i2 = EnumC15375i1.ERROR;
                Object[] objArr2 = new Object[i11];
                objArr2[c10] = Integer.valueOf(i14);
                interfaceC15127H.mo16298o(enumC15375i2, "Item %d has no header", objArr2);
                c9 = c10;
                i10 = i11;
                it = it3;
            } else {
                boolean zEquals = EnumC15361h1.Event.equals(c15326c1.f47870o0);
                String str = sVDIzpC.lfehSKPiatPUVYB;
                C15175X0 c15175x0 = (C15175X0) c11241l2.f34016Y;
                C15326c1 c15326c2 = c15321b1.f47863a;
                InterfaceC15151P interfaceC15151P = this.f48489g;
                Charset charset = f48486i;
                it = it3;
                C15109B c15109b = this.f48487e;
                if (zEquals) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c15321b1.m16529d()), charset));
                        try {
                            C15347d1 c15347d1 = (C15347d1) interfaceC15151P.mo16323c(bufferedReader, C15347d1.class);
                            if (c15347d1 == null) {
                                interfaceC15127H.mo16298o(EnumC15375i1.ERROR, str, Integer.valueOf(i14), c15326c2.f47870o0);
                            } else {
                                C15445r c15445r = c15347d1.f47196o0;
                                if (c15445r != null) {
                                    String str2 = c15445r.f48204Y;
                                    if (str2.startsWith("sentry.javascript") || str2.startsWith("sentry.dart") || str2.startsWith("sentry.dotnet")) {
                                        c15516w.m16729c("sentry:isFromHybridSdk", Boolean.TRUE);
                                    }
                                }
                                C15447t c15447t = c15175x0.f47239Y;
                                if (c15447t == null || c15447t.equals(c15347d1.f47194Y)) {
                                    c15109b.mo16239F(c15347d1, c15516w);
                                    interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "Item %d is being captured.", Integer.valueOf(i14));
                                    if (!m16736f(c15516w)) {
                                        interfaceC15127H.mo16298o(EnumC15375i1.WARNING, "Timed out waiting for event id submission: %s", c15347d1.f47194Y);
                                        bufferedReader.close();
                                        return;
                                    }
                                } else {
                                    interfaceC15127H.mo16298o(EnumC15375i1.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i14), c15175x0.f47239Y, c15347d1.f47194Y);
                                    bufferedReader.close();
                                    c9 = 0;
                                    i10 = 1;
                                }
                                interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Item failed to process.", th);
                            }
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            try {
                                bufferedReader.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Item failed to process.", th5);
                    }
                } else if (EnumC15361h1.Transaction.equals(c15326c2.f47870o0)) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c15321b1.m16529d()), charset));
                        try {
                            C15421A c15421a = (C15421A) interfaceC15151P.mo16323c(bufferedReader2, C15421A.class);
                            try {
                                if (c15421a != null) {
                                    C15430c c15430c = c15421a.f47195Z;
                                    C15447t c15447t2 = c15175x0.f47239Y;
                                    if (c15447t2 == null || c15447t2.equals(c15421a.f47194Y)) {
                                        C15158R1 c15158r1 = c15175x0.f47241o0;
                                        if (c15430c.m16660a() != null) {
                                            c15430c.m16660a().f47147p0 = m16734d(c15158r1);
                                        }
                                        c15109b.mo16234A(c15421a, c15158r1, c15516w, null);
                                        interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "Item %d is being captured.", Integer.valueOf(i14));
                                        if (!m16736f(c15516w)) {
                                            interfaceC15127H.mo16298o(EnumC15375i1.WARNING, "Timed out waiting for event id submission: %s", c15421a.f47194Y);
                                            bufferedReader2.close();
                                            return;
                                        }
                                    } else {
                                        try {
                                            interfaceC15127H.mo16298o(EnumC15375i1.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i14), c15175x0.f47239Y, c15421a.f47194Y);
                                            bufferedReader2.close();
                                            c9 = 0;
                                            i10 = 1;
                                            c10 = c9;
                                            i11 = i10;
                                            i13 = i14;
                                            it3 = it;
                                            c11241l2 = c11241l;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            th2 = th;
                                            bufferedReader2.close();
                                            throw th2;
                                        }
                                    }
                                    th = th6;
                                    th2 = th;
                                    bufferedReader2.close();
                                    throw th2;
                                }
                                try {
                                    interfaceC15127H.mo16298o(EnumC15375i1.ERROR, str, Integer.valueOf(i14), c15326c2.f47870o0);
                                } catch (Throwable th7) {
                                    th2 = th7;
                                    try {
                                        bufferedReader2.close();
                                        throw th2;
                                    } catch (Throwable th8) {
                                        th2.addSuppressed(th8);
                                        throw th2;
                                    }
                                }
                                bufferedReader2.close();
                            } catch (Throwable th9) {
                                th = th9;
                                interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Item failed to process.", th);
                            }
                        } catch (Throwable th10) {
                            th = th10;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                    }
                } else {
                    c15109b.mo16237D(new C11241l(c15175x0.f47239Y, c15175x0.f47240Z, c15321b1), c15516w);
                    EnumC15375i1 enumC15375i3 = EnumC15375i1.DEBUG;
                    EnumC15361h1 enumC15361h1 = c15326c2.f47870o0;
                    interfaceC15127H.mo16298o(enumC15375i3, "%s item %d is being captured.", enumC15361h1.getItemType(), Integer.valueOf(i14));
                    if (!m16736f(c15516w)) {
                        interfaceC15127H.mo16298o(EnumC15375i1.WARNING, "Timed out waiting for item type submission: %s", enumC15361h1.getItemType());
                        return;
                    }
                }
                Object objM9088b = AbstractC8465D3.m9088b(c15516w);
                if ((objM9088b instanceof InterfaceC15371j) && !((InterfaceC15371j) objM9088b).mo16392e()) {
                    interfaceC15127H.mo16298o(EnumC15375i1.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i14));
                    return;
                }
                Object objM9088b2 = AbstractC8465D3.m9088b(c15516w);
                if (!C15188F.class.isInstance(AbstractC8465D3.m9088b(c15516w)) || objM9088b2 == null) {
                    c9 = 0;
                    i10 = 1;
                } else {
                    C15188F c15188f = (C15188F) objM9088b2;
                    i10 = 1;
                    c15188f.f47326o0 = new CountDownLatch(1);
                    c9 = 0;
                    c15188f.f47324Y = false;
                    c15188f.f47325Z = false;
                }
                c10 = c9;
                i11 = i10;
                i13 = i14;
                it3 = it;
                c11241l2 = c11241l;
            }
            c10 = c9;
            i11 = i10;
            i13 = i14;
            it3 = it;
            c11241l2 = c11241l;
        }
    }
}
