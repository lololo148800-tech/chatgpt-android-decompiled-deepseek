package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import p544W9.AbstractC8483G3;

/* JADX INFO: renamed from: io.sentry.transport.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C15487j extends Authenticator {

    /* JADX INFO: renamed from: a */
    public final String f48375a;

    /* JADX INFO: renamed from: b */
    public final String f48376b;

    public C15487j(String str, String str2) {
        AbstractC8483G3.m9133c(str, "user is required");
        this.f48375a = str;
        AbstractC8483G3.m9133c(str2, "password is required");
        this.f48376b = str2;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) {
            return null;
        }
        return new PasswordAuthentication(this.f48375a, this.f48376b.toCharArray());
    }
}
