package io.sentry.profilemeasurements;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.profilemeasurements.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15419a implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public ConcurrentHashMap f48045Y;

    /* JADX INFO: renamed from: Z */
    public String f48046Z;

    /* JADX INFO: renamed from: o0 */
    public Collection f48047o0;

    public C15419a(String str, AbstractCollection abstractCollection) {
        this.f48046Z = str;
        this.f48047o0 = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15419a.class != obj.getClass()) {
            return false;
        }
        C15419a c15419a = (C15419a) obj;
        return AbstractC8483G3.m9132b(this.f48045Y, c15419a.f48045Y) && this.f48046Z.equals(c15419a.f48046Z) && new ArrayList(this.f48047o0).equals(new ArrayList(c15419a.f48047o0));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48045Y, this.f48046Z, this.f48047o0});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("unit");
        c11248s.m12677z(interfaceC15127H, this.f48046Z);
        c11248s.m12668o("values");
        c11248s.m12677z(interfaceC15127H, this.f48047o0);
        ConcurrentHashMap concurrentHashMap = this.f48045Y;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48045Y, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
