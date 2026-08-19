package p641a7;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: a7.c */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC10517c {
    f31167o0("us1", "browser-intake-datadoghq.com"),
    /* JADX INFO: Fake field, exist only in values array */
    US3("us3"),
    /* JADX INFO: Fake field, exist only in values array */
    US5("us5"),
    /* JADX INFO: Fake field, exist only in values array */
    EF43("eu1", "browser-intake-datadoghq.eu"),
    /* JADX INFO: Fake field, exist only in values array */
    AP1("ap1"),
    /* JADX INFO: Fake field, exist only in values array */
    EF65("us1_fed", "browser-intake-ddog-gov.com"),
    /* JADX INFO: Fake field, exist only in values array */
    EF77("staging", "browser-intake-datad0g.com");


    /* JADX INFO: renamed from: Y */
    public final String f31169Y;

    /* JADX INFO: renamed from: Z */
    public final String f31170Z;

    EnumC10517c(String str, String str2) {
        this.f31169Y = str;
        this.f31170Z = AbstractC9306j0.m9889h("https://", str2);
    }

    EnumC10517c(String str) {
        this(str, AbstractC10763a.m11054l("browser-intake-", str, "-datadoghq.com"));
    }
}
