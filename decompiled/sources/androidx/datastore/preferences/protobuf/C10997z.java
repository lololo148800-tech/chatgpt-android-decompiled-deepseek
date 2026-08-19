package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z */
/* JADX INFO: loaded from: classes.dex */
public class C10997z extends IOException {
    /* JADX INFO: renamed from: a */
    public static C10997z m11726a() {
        return new C10997z("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: b */
    public static C10995y m11727b() {
        return new C10995y("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: c */
    public static C10997z m11728c() {
        return new C10997z("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    public static C10997z m11729d() {
        return new C10997z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: e */
    public static C10997z m11730e() {
        return new C10997z("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: f */
    public static C10997z m11731f() {
        return new C10997z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
