package androidx.glance.appwidget.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.A */
/* JADX INFO: loaded from: classes.dex */
public class C11005A extends IOException {

    /* JADX INFO: renamed from: Y */
    public boolean f33223Y;

    /* JADX INFO: renamed from: a */
    public static C11005A m11843a() {
        return new C11005A("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: b */
    public static C11064z m11844b() {
        return new C11064z("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: c */
    public static C11005A m11845c() {
        return new C11005A("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    public static C11005A m11846d() {
        return new C11005A("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: e */
    public static C11005A m11847e() {
        return new C11005A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
