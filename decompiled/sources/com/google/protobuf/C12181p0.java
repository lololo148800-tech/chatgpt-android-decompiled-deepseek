package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.p0 */
/* JADX INFO: loaded from: classes3.dex */
public class C12181p0 extends IOException {

    /* JADX INFO: renamed from: Y */
    public boolean f37067Y;

    /* JADX INFO: renamed from: a */
    public static C12181p0 m14060a() {
        return new C12181p0("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: b */
    public static C12181p0 m14061b() {
        return new C12181p0("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: c */
    public static C12178o0 m14062c() {
        return new C12178o0("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: d */
    public static C12181p0 m14063d() {
        return new C12181p0("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: e */
    public static C12181p0 m14064e() {
        return new C12181p0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: f */
    public static C12181p0 m14065f() {
        return new C12181p0("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: g */
    public static C12181p0 m14066g() {
        return new C12181p0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
